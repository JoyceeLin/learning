package learning.spring.ioc;

import org.junit.After;
import org.junit.Test;

/**
 * @Author Lin JingHui
 * @Date 2019/1/16
 */
public class IocTest {

    private static DefaultBeanFactory factory = new DefaultBeanFactory();

    @Test
    public void testRegister() throws Exception{
        BeanDefinition bd = new GenericBeanDefinition();
        ((GenericBeanDefinition) bd).setBeanClass(TeacherBean.class);
        ((GenericBeanDefinition) bd).setInitMethodName("init");
        factory.registerBeanDefinition("teacher", bd);
    }

    @After
    public void testGetBean() throws Exception{
        TeacherBean t = (TeacherBean) factory.getBean("teacher");
        TeacherBean t1 = (TeacherBean) factory.getBean("teacher");
        t.teach();
        t1.teach();
        System.out.println(t == t1);
    }
}
