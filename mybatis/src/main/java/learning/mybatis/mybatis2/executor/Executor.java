/*

 */
package learning.mybatis.mybatis2.executor;

import learning.mybatis.mybatis2.config.MapperRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:27
 * @Version V1.0
 */
public interface Executor {

    <T> T query(MapperRepository.MapperData mapperData, Object parameter) throws InvocationTargetException, SQLException, IllegalAccessException, NoSuchMethodException;
}
