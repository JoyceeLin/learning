package learning.autoconfigure;

import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/7/13 17:50
 * @Version V1.0
 */
@Configuration
@EnableConfigurationProperties(ServerProperties.class)
public class ServerAutoConfiguration {

    private Logger logger = LoggerFactory.getLogger(ServerAutoConfiguration.class);

    @Bean
    @ConditionalOnClass(HttpServer.class)
    public HttpServer httpServer(ServerProperties serverProperties) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(serverProperties.getPort()), 0);
        server.start();
        logger.info("启动成功：端口为：[{}]", serverProperties.getPort());
        return server;
    }
}
