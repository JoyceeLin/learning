/*

 */
package learning.mybatis1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:04
 * @Version V1.0
 */
public class MapperProxy<T> implements InvocationHandler {

    private SqlSession sqlSession;
    private Class<T> mapperInterface;

    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用方法
        if (method.getDeclaringClass().getName().equals(MapperXml.nameSpace)) {
            String sql = MapperXml.methodSqlMapping.get(method.getName());
            System.out.println(String.format("SQL [%s], parameter [%s] ", sql, args[0]));
            return sqlSession.selectOne(sql, String.valueOf(args[0]));
        }
        return null;
    }
}
