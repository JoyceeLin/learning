package learning.others.framework.mq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Lin JingHui
 * @Date 2018/9/14
 */
public class Producer {

    private DefaultMQProducer producer = new DefaultMQProducer();
    private static String groupName = PropertiesUtil.getInstance().getValue("mq.rocket.producer.group");
    private static String topic = PropertiesUtil.getInstance().getValue("mq.rocket.producer.topic");
    private static String nameServer = PropertiesUtil.getInstance().getValue("mq.rocket.producer.namesrvAddr");
    private final static Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    public Producer() {
        init();
    }

    private void init() {
        producer.setProducerGroup(groupName);
        producer.setNamesrvAddr(nameServer);
        producer.setInstanceName(RunTimeUtil.getRocketMqUniqueInstanceName());
        try {
            producer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendMessage(String saleCase) {
        final Message mq = new Message(topic, "allocation", ObjectToByteUtil.objectToByteArray(saleCase));
        mq.setDelayTimeLevel(9);
        try {
            producer.send(mq, new SendCallback() {
                @Override
                public void onSuccess(SendResult sendResult) {
                    LOGGER.info("发送同步消息请求成功, message={}", mq);
                }

                @Override
                public void onException(Throwable e) {
                    LOGGER.error("发送同步消息请求失败: e={}, mq = {}", e.getMessage(), mq);
                }
            }, 3000);
        } catch (Exception e) {
            LOGGER.error("发送消息异常, e = {}, message = {}", e.getMessage(), mq);
        }
    }

    public void shutdown() {
        producer.shutdown();
    }

}
