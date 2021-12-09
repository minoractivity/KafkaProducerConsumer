package com.minoractivity.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {

	@KafkaListener(topics=Constants.TOPIC_NAME,groupId=Constants.GROUP_ID)
	public void consume(String message) {
		System.out.println("-----------message---------------->>>>>"+message);
	}
}
