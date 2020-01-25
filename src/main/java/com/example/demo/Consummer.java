package com.example.demo;

import lombok.extern.java.Log;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@Log
public class Consummer {

	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(Message message){
		log.info(">>>>>>>>>>>> Received Message: " + message.getPayload().toString());
	}
}
