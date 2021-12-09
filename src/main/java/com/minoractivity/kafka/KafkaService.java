package com.minoractivity.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessageToKafkaTopic(String message) {
		
		System.err.println("message send-->"+message);
		kafkaTemplate.send(Constants.TOPIC_NAME, message);
		
	}

}
