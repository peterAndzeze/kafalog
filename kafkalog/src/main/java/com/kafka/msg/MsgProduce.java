package com.kafka.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * Created by wodezuiaishinageren on 2017/9/4.
 */
@Component
public class MsgProduce {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送消息
     * @param topic
     * @param msg
     */
    public void sendMag(String topic,String msg){
        System.out.println("发送主题："+topic+"，消息："+msg);
        ListenableFuture<Object> listenableFuture= kafkaTemplate.send(topic,msg);
        listenableFuture.addCallback(new ListenableFutureCallback<Object>() {

            @Override
            public void onSuccess(Object o) {
                System.out.println("发送成功处理************");
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("发送失败处理*************");
            }
        });
    }


}
