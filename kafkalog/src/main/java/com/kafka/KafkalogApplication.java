package com.kafka;

import com.alibaba.fastjson.JSON;
import com.kafka.msg.MsgModel;
import com.kafka.msg.MsgProduce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KafkalogApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(KafkalogApplication.class, args);
		MsgProduce msgProduce=applicationContext.getBean(MsgProduce.class);
		MsgModel msgModel=new MsgModel();
		msgModel.setId(1L);
		msgModel.setMsg("测试");
		msgModel.setTopic("test");
		String str= JSON.toJSONString(msgModel);
		msgProduce.sendMag("test",str);


	}
}
