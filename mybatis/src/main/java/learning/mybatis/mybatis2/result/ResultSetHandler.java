/*

 */
package learning.mybatis.mybatis2.result;

import learning.mybatis.mybatis2.config.Configuration;
import learning.mybatis.mybatis2.config.MapperRepository;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:22
 * @Version V1.0
 */
public class ResultSetHandler {

    private Configuration configuration;

    public ResultSetHandler(Configuration configuration) {
        this.configuration = configuration;
    }

    public <E> E handle(PreparedStatement stmt, MapperRepository.MapperData mapperData) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object resultObj = new DefaultObjectFactory().create(mapperData.getType());
        ResultSet resultSet = stmt.getResultSet();
        if (resultSet.next()) {
            int i = 0;
            for (Field field : resultObj.getClass().getDeclaredFields()) {
                setValue(resultObj, field, resultSet);
            }
        }
        return (E) resultObj;
    }

    public void setValue(Object resultObj, Field field, ResultSet rs) throws NoSuchMethodException, SQLException, InvocationTargetException, IllegalAccessException {
        Method setMethod = resultObj.getClass().getMethod("set" + upperCapital(field.getName()), field.getType());
        setMethod.invoke(resultObj, getResult(field, rs));
    }

    private Object getResult(Field field, ResultSet rs) throws SQLException {
        Class type = field.getType();
        if (Integer.class == type) {
            return rs.getInt(field.getName());
        } else if (String.class == type) {
            return rs.getString(field.getName());
        }
        return rs.getString(field.getName());
    }

    private String upperCapital(String name) {
        String first = name.substring(0, 1);
        String tail = name.substring(1);
        return first.toUpperCase() + tail;
    }
}
