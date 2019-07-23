/*

 */
package learning.mybatis2.mapper;

import learning.mybatis2.bean.Test;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:21
 * @Version V1.0
 */
public interface TestMapper {
    Test selectByPrimaryKey(Integer id);
}
