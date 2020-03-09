/*

 */
package learning.mybatis.mybatis2.executor;

import learning.mybatis.mybatis2.config.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/7/23 16:22
 * @Version V1.0
 */
public class ExecutorFactory {

    private static Map<String, Executor> executorMap = new HashMap<>();

    public static Executor get(ExecutorType name, Configuration config) {
        if (ExecutorType.CACHING.equals(name)) {
            return new CacheExecutor(new SimpleExecutor(config));
        }
        return new SimpleExecutor(config);
    }

    public enum ExecutorType {
        /**
         * 默认
         */
        DEFAULT("Simple"),
        /**
         * 缓存
         */
        CACHING("Cache"),;
        private String name;

        ExecutorType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
