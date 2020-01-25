package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${spring.jms.topic.a}")
	String topica;

	public void send(String msg){
		jmsTemplate.setPubSubDomain(true);
		jmsTemplate.convertAndSend(topica, msg);
	}

}
