package com.gjjf.commonservice.userCenter.Sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gjjf.framework.rabbitMq.sender.RabbitMqSenderUtil;

/**
 * 消息发送
 * @author henser
 *
 */
@Component
public class UserSender {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
    public void send() {
    	logger.info("henser 发送消息...");
    	String message = "测试消息队列发送";
    	RabbitMqSenderUtil.send("userInfo", message);
    }
	
}