package learning.spring.ioc;

/**
 * @author Lin JingHui
 * @date 2019/1/16
 */
public interface BeanFactory {

    /**
     * 通过name 获取bean
     * @param name bean名
     * @return 对象
     * @throws Exception 异常信息
     */
    Object getBean(String name) throws Exception;
}
