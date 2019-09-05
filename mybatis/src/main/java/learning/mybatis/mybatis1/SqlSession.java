/*

 */
package learning.mybatis.mybatis1;

import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:04
 * @Version V1.0
 */
public class SqlSession {

    Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement, Object parameter) {
        return executor.query(statement, parameter);
    }

    public <T> T getMapper(Class<T> mapperClass) {
        return (T) Proxy.newProxyInstance(mapperClass.getClassLoader(), new Class[]{mapperClass}, new MapperProxy(this, mapperClass));
    }
}
