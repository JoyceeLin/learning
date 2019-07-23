/*

 */
package learning.mybatis1;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 11:04
 * @Version V1.0
 */
public class BootStrap {

    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Test test = mapper.selectByPrimaryKey(2);
        System.out.println(test);
    }
}
