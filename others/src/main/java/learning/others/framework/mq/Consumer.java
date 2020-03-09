package learning.others.framework.mq;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Lin JingHui
 * @Date 2018/9/14
 */
public class Consumer {

    private static DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
    private static String topic = PropertiesUtil.getInstance().getValue("mq.rocket.consumer.topic");
    private static String groupName = PropertiesUtil.getInstance().getValue("mq.rocket.consumer.group");
    private static String nameServerAddress = PropertiesUtil.getInstance().getValue("mq.rocket.consumer.namesrvAddr");
    private static MessageListenerConcurrently translationListener = SpringContextUtil.getBean("allocateListener");

    public Consumer() {
    }

    static {
        try {
            init();
        } catch (Exception e) {
            LOGGER.error("init mq consumer error", e);
        }
    }

    private static void init() throws Exception {
        consumer = new DefaultMQPushConsumer(groupName);
        consumer.setNamesrvAddr(nameServerAddress);
        consumer.setVipChannelEnabled(false);
        consumer.subscribe(topic, "*");
        consumer.registerMessageListener(translationListener);
    }

    public static void start() throws Exception {
        if (consumer == null) {
            init();
        }
        consumer.start();
    }

    public static void shutdown() {
        consumer.shutdown();
    }

}
