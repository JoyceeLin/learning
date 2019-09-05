/*

 */
package learning.mybatis.mybatis1;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:03
 * @Version V1.0
 */
public interface Executor {

    <T> T query(String statement, Object parameter);
}
