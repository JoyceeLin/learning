package learning.mybatis.mybatis1;

import java.util.HashMap;
import java.util.Map;

public class MapperXml {
    public static final String nameSpace = "learning.mybatis.mybatis1.Mapper";

    public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

    static {
        methodSqlMapping.put("selectByPrimaryKey", "select * from test where id = %d");
    }
}