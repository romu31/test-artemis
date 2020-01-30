package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@Autowired
	Producer producer;



	@GetMapping(value="/produce")
	public String produce(@RequestParam("msg")String msg){
		producer.send(msg);
		return "Done";
	}

	@GetMapping(value="/createL")
	public String createListener(@RequestParam("topicId")String topicId){

		return "Done";
	}


}
