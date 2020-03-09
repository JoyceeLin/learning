package learning.others.framework.mq;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * 配置信息
 *
 * @author ZRD
 * @since 2015-11-16 上午10:19:46
 */
public class PropertiesUtil {

    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static final String CONFIG_FILE = "mq.properties";

    private static PropertiesUtil config = null;

    private Properties properties = new Properties();

    private long lastModified;

    private PropertiesUtil() {
        this.monitorFileChanged();
    }

    /**
     * 监控属性文件发生变化
     */
    private void monitorFileChanged() {
        // 配置文件config.properties路径
        URL url = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE);
        final File file = new File(url.getFile());

        loadConfig(file);

        Thread monitorFileChangedThread = new Thread("fileChangedMonitorThread") {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (file.lastModified() > PropertiesUtil.this.lastModified) {
                            // 初始化属性文件
                            loadConfig(file);
                        }
                        logger.info("File changed monitor.");
                    } catch (Exception e) {
                        logger.error("", e);
                    }

                    try {
                        Thread.sleep(1800000);//30分钟
                    } catch (Exception e) {
                        logger.error("", e);
                    }
                }
            }
        };
        monitorFileChangedThread.start();
    }


    private void loadConfig(File file) {
        PropertiesUtil.this.initProperties();

        PropertiesUtil.this.lastModified = file.lastModified();

        logger.info("file changed.");
    }

    /**
     * 初始化属性文件
     */
    private void initProperties() {
        InputStream inStream = this.getClass().getClassLoader().getResourceAsStream(CONFIG_FILE);
        if (inStream == null) {
            logger.error("根目录下找不到config.properties文件");
            return;
        }
        try {
            properties.load(inStream);
            inStream.close();
        } catch (IOException e) {
            logger.error("", e);
        }
        logger.info("load mq.properties success.");
    }

    public static PropertiesUtil getInstance() {
        if (config == null) {
            synchronized (PropertiesUtil.class) {
                PropertiesUtil tmp = config;
                if (tmp == null) {
                    tmp = new PropertiesUtil();
                    config = tmp;
                }
            }
        }
        return config;
    }

    public String getValue(String key) {
        return getValue(key, "");
    }

    public String getValue(String key, String defaultValue) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        String value = properties.getProperty(key, defaultValue);
        return value;
    }
}
