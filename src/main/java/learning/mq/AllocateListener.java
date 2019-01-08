package learning.mq;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lin JingHui
 * @Date 2018/7/18
 */
@Service("allocateListener")
public class AllocateListener implements MessageListenerConcurrently {

    private final static Logger LOGGER = LoggerFactory.getLogger(AllocateListener.class);

    public AllocateListener() {
    }

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        if (msgs == null) {
            throw new RuntimeException("has no Message!");
        }
        for (Message m : msgs) {
            try {
                this.process(m.toString());
            } catch (Exception e) {
                LOGGER.error("消费异常！ e={}, message = {}", e.getMessage(), m);
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }

    public void process(String newSaleCase) {
        LOGGER.info("收到mq消息，saleCase = {}", newSaleCase);
    }

}
