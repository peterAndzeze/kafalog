package com.kafka.msg;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by wodezuiaishinageren on 2017/9/4.
 */
@Component
public class MsgConsumer {
    /**
     * 主题test的接收消息
     * @param consumerRecord
     */
    @KafkaListener(topics = {"test"})
    public void acceptMsg(ConsumerRecord<Integer,String> consumerRecord){
        Optional optional=Optional.ofNullable(consumerRecord.value());
        if (optional.isPresent()) {//存在值
            System.out.println("接收消息为：" + consumerRecord);
        }

    }
}
