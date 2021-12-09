package com.minoractivity.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka/api")
public class KafkaController {
	
	@Autowired
	KafkaService service;
	
	@GetMapping("/send")
	public void sendMessageToKafka(@RequestParam("message") String message) {
		
     service.sendMessageToKafkaTopic(message);
		
	}

}
