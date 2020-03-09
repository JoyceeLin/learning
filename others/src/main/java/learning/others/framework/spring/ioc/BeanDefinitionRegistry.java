package learning.others.framework.spring.ioc;

/**
 * @Author Administrator
 * @Date 2019/1/16
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册bean
     *
     * @param beanName
     * @param beanDefinition
     * @throws Exception
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;

    /**
     * 获取bean定义
     *
     * @param beanName
     * @return
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 是否已经定义了bean
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);
}
