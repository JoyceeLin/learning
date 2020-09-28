package learning.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/9/28 11:30
 * @Version V1.0
 */
public class LoadingCacheTest {

    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String, String> graphs = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .refreshAfterWrite(1, TimeUnit.MINUTES)
                .build(
                        new CacheLoader<String, String>() {
                            @Override
                            // no checked exception
                            public String load(String key) {
                                return "";
                            }
                        }
                );
        graphs.put("a", "1");
        System.out.println(graphs.get("a"));
    }
}
