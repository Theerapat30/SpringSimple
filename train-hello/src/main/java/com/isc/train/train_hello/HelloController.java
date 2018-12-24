package com.isc.train.train_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/home")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/greeting")
	public GreetingBean greeting(@RequestParam(value="greeting", defaultValue="Greet") String name) {
		GreetingBean bean = new GreetingBean();
		bean.setRespCode("9000");
		bean.setRespDesc("Status OK");
		return bean;
	}

}
