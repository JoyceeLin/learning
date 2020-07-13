package learning.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/7/13 17:48
 * @Version V1.0
 */
@ConfigurationProperties(prefix = "jinghui.server")
public class ServerProperties {

    private static final Integer DEFAULT_PORT = 8080;

    private Integer port = DEFAULT_PORT;

    public static Integer getDefaultPort() {
        return DEFAULT_PORT;
    }

    public Integer getPort() {
        return port;
    }

    public ServerProperties setPort(Integer port) {
        this.port = port;
        return this;
    }
}
