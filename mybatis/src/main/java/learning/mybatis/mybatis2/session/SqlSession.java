/*

 */
package learning.mybatis.mybatis2.session;

import learning.mybatis.mybatis2.config.Configuration;
import learning.mybatis.mybatis2.config.MapperRepository;
import learning.mybatis.mybatis2.executor.Executor;
import learning.mybatis.mybatis2.mapper.MapperProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:22
 * @Version V1.0
 */
public class SqlSession {

    private Configuration configuration;
    private Executor executor;

    public SqlSession(Configuration config, Executor executor) {
        this.configuration = config;
        this.executor = executor;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public <T> T selectOne(MapperRepository.MapperData mapperData, Object parameter) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return executor.query(mapperData, parameter);
    }

    public <T> T getMapper(Class<T> testMapperClass) {
        return (T) Proxy.newProxyInstance(testMapperClass.getClassLoader(), new Class[]{testMapperClass}, new MapperProxy(this));
    }
}
