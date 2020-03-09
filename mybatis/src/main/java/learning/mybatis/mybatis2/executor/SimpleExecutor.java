/*

 */
package learning.mybatis.mybatis2.executor;

import learning.mybatis.mybatis2.config.Configuration;
import learning.mybatis.mybatis2.config.MapperRepository;
import learning.mybatis.mybatis2.statement.StatementHandler;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:22
 * @Version V1.0
 */
public class SimpleExecutor implements Executor {

    private Configuration configuration;

    public SimpleExecutor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T query(MapperRepository.MapperData mapperData, Object parameter) throws InvocationTargetException, SQLException, IllegalAccessException, NoSuchMethodException {
        StatementHandler statementHandler = new StatementHandler(configuration);
        return statementHandler.query(mapperData, parameter);
    }
}
