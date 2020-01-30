package com.example.demo;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.TopicSubscriber;

@Component
public class TopicListener {

	@Autowired
	private ActiveMQConnectionFactory connectionFactory;

	private Connection createConnection(String cliendId,String  topicname) throws JMSException {

		Connection res =  connectionFactory.createConnection();
		res.setClientID(cliendId);
		res.createSession().createConsumer(new TopicSubscriber()); //Message Lsietener etc

	}

}
