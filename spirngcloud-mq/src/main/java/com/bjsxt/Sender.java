package com.bjsxt;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 消息发送者
 * @author Administrator
 *
 */
@Component
public class Sender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	/*
	 * 发送消息的方法
	 */
	public void send(String msg){
		//向消息队列发送消息
		//参数一：队列的名称。
		//参数二：消息
		this.amqpTemplate.convertAndSend("hello-queue",msg);
		
	}
	
	

}
