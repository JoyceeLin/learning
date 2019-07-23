/*

 */
package learning.mybatis2.config;

import learning.mybatis2.bean.Test;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 17:11
 * @Version V1.0
 */
public class MapperRepository {

    private Map<String, MapperData> methodSqlMapping = new HashMap<>();

    public MapperRepository() {
        // todo 从配置文件中读取
        methodSqlMapping.put("learning.mybatis2.mapper.TestMapper.selectByPrimaryKey",
                new MapperData("select * from Test where id = %d", Test.class));
    }

    public MapperData getMapperData(String methodName) {
        return methodSqlMapping.get(methodName);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class MapperData<T> {
        private String sql;
        private Class<T> type;
    }
}
