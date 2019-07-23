/*

 */
package learning.mybatis2.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:21
 * @Version V1.0
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {

    private String scanPath;

    private MapperRepository mapperRepository = new MapperRepository();

    public void build() {
        // scanPath, 填充mapper对应方法
        if (null == scanPath || scanPath.length() < 1) {
            throw new RuntimeException("scan path is required .");
        }
    }

    public Configuration scanPath(String scanPath) {
        this.scanPath = scanPath;
        return this;
    }

    public static void main(String[] args) {
        new Configuration().scanPath("learning.mybatis2.mapper").build();
    }
}
