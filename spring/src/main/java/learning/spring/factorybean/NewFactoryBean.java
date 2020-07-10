/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/4/8 18:04
 * @Version V1.0
 */
@Component
public class NewFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        // 可能进行一些bean加工操作、单例模式等的定制化的bean加工
        return new FactoryBeanImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanImpl.class;
    }

    private class FactoryBeanImpl implements FactoryBeanService{
        @Override
        public void testFactoryBean() {
            System.out.println("testFactoryBean");
        }
    }

    interface FactoryBeanService {
        void testFactoryBean();
    }

    public void test() {
        ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("pplicationContext.xml");
        FactoryBeanService beanService = cac.getBean(FactoryBeanService.class);
        beanService.testFactoryBean();
    }
}
