/*

 */
package learning.mybatis.mybatis2.mapper;

import learning.mybatis.mybatis2.config.MapperRepository;
import learning.mybatis.mybatis2.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:21
 * @Version V1.0
 */
public class MapperProxy implements InvocationHandler {

    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MapperRepository.MapperData mapperData = sqlSession.getConfiguration().getMapperRepository()
                .getMapperData(method.getDeclaringClass().getName() + "." + method.getName());
        if (null == mapperData) {
            System.out.println("error! can not find methodName = " + method.getName());
        }
        return sqlSession.selectOne(mapperData, args[0]);
    }
}
