package learning.framework.spring.ioc;

import java.util.Objects;

/**
 * @Author Lin JingHui
 * @Date 2019/1/16
 */
public class GenericBeanDefinition implements BeanDefinition {

    private Class<?> beanClass;

    private String scope = BeanDefinition.SINGLETON;

    private String initMethodName;

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    @Override
    public Class<?> getBeanClass() {
        return beanClass;
    }

    @Override
    public String getScope() {
        return scope;
    }

    @Override
    public boolean isSingleton() {
        return Objects.equals(scope, BeanDefinition.SINGLETON);
    }

    @Override
    public boolean isPrototype() {
        return Objects.equals(scope, BeanDefinition.PROTOTYPE);
    }

    @Override
    public String getInitMethodName() {
        return initMethodName;
    }
}
