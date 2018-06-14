package com.ys.component;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ys.ProviderApplication;
/**
 * 发送者
* <p>Title: Sender </p>
* <p>Description: </p>
* <p>Company: westlife</p> 
* @author westlife
* @date 2018年6月12日 上午10:58:15
 */
@Component
public class Sender implements RabbitTemplate.ConfirmCallback, ReturnCallback {

	private static Logger logger = Logger.getLogger(ProviderApplication.class);
	
    //rabbitTemplate是springboot 提供的默认实现
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostConstruct
	public void init() {
		rabbitTemplate.setConfirmCallback(this);
		rabbitTemplate.setReturnCallback(this);
	}
   /**
    * 确认后回调: 接口ConfirmCallback
    */
	@Override
	public void confirm(CorrelationData correlationData, boolean ack, String cause) {
		if (ack) {
			logger.info("消息发送成功:" + correlationData);
		} else {
			logger.info("消息发送失败:" + cause);
		}

	}
    /**
     * 失败后return回调 接口 ReturnCallback
     */
	@Override
	public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
		logger.error(message.getMessageProperties().getCorrelationIdString() + " 发送失败");

	}

	// 发送消息，不需要实现任何接口，供外部调用。
	public void send(String msg) {

		CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());

		logger.info("开始发送消息 : " + msg.toLowerCase());
		rabbitTemplate.convertAndSend("queue1", msg);
		//String response = rabbitTemplate.convertSendAndReceive("topicExchange", "queue1", msg, correlationId).toString();
		logger.info("结束发送消息 : " + msg.toLowerCase());
		//logger.info("消费者响应 : " + response + " 消息处理完成");
	}
}