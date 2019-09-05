/*

 */
package learning.mybatis.mybatis2.executor;

import learning.mybatis.mybatis2.config.Configuration;
import learning.mybatis.mybatis2.config.MapperRepository;
import learning.mybatis.mybatis2.statement.StatementHandler;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:21
 * @Version V1.0
 */
public class CacheExecutor implements Executor {

    private Configuration configuration;
    private Executor delegate;

    private Map<String, Object> localCache = new HashMap<>();

    public CacheExecutor(Executor delegate) {
        this.delegate = delegate;
    }

    public CacheExecutor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T query(MapperRepository.MapperData mapperData, Object parameter) throws InvocationTargetException, SQLException, IllegalAccessException, NoSuchMethodException {
        StatementHandler statementHandler = new StatementHandler(configuration);
        Object result = localCache.get(mapperData.getSql());
        if (result == null) {
            result = delegate.query(mapperData, parameter);
            localCache.put(mapperData.getSql(), result);
        }
        return (T) result;
    }
}
