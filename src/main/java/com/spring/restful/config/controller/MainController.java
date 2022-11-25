package com.spring.restful.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/restful/


@RestController
@RequestMapping("/Main")
//http://localhost:8080/restful/Main
public class MainController {
	
	//http://localhost:8080/restful/Main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "Hi Yosri !!";
	}

}
