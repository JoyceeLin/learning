
package learning.spring.resourcecode;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/31 14:13
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        // 1 BeanFactory启动、获取Bean
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(""));
        beanFactory.getBean("Test");

        // 2 ApplicationContext启动、获取Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        applicationContext.getBean("Test");

        // 3 通过构造函数注入构造BeanDefinition
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = new RootBeanDefinition(Main.class);
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0, "index10");
        beanDefinition.setConstructorArgumentValues(argumentValues);
        defaultListableBeanFactory.registerBeanDefinition("main", beanDefinition);
        Main main = defaultListableBeanFactory.getBean(Main.class);
        System.out.println(main);

        // 4 BeanDefinitionReader读取配置注册到BeanDefinitionRegistry中
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new BeanDefinitionReaderImpl(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions("");

        // 5 BeanDefinitionReader读取配置装载到beanFactory1中
        DefaultListableBeanFactory beanFactory1 = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory1);
        reader.loadBeanDefinitions("..xml");
        Main main1 = (Main) beanFactory1.getBean("Main");

        // 6后置处理器
        ConfigurableListableBeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource(""));
        PropertyPlaceholderConfigurer postProcessor = new PropertyPlaceholderConfigurer();
        postProcessor.setLocation(new ClassPathResource(""));
        postProcessor.postProcessBeanFactory(beanFactory2);

        // 7.BeanWrapper加载器
        BeanWrapper beanWrapper = new BeanWrapperImpl();
        beanWrapper.setPropertyValue("aaa", new Main());
    }

    static class BeanDefinitionReaderImpl implements BeanDefinitionReader{

        private BeanDefinitionRegistry beanDefinitionRegistry;

        BeanDefinitionReaderImpl(BeanDefinitionRegistry beanDefinitionRegistry) {
            this.beanDefinitionRegistry = beanDefinitionRegistry;
        }

        @Override
        public BeanDefinitionRegistry getRegistry() {
            return null;
        }

        @Override
        public ResourceLoader getResourceLoader() {
            return null;
        }

        @Override
        public ClassLoader getBeanClassLoader() {
            return null;
        }

        @Override
        public BeanNameGenerator getBeanNameGenerator() {
            return null;
        }

        @Override
        public int loadBeanDefinitions(Resource resource) throws BeanDefinitionStoreException {
            return 0;
        }

        @Override
        public int loadBeanDefinitions(Resource... resources) throws BeanDefinitionStoreException {
            return 0;
        }

        @Override
        public int loadBeanDefinitions(String location) throws BeanDefinitionStoreException {
            return 0;
        }

        @Override
        public int loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException {
            return 0;
        }
    }
}
