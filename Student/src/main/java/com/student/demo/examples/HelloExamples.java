package com.student.demo.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class HelloExamples {
	
	@GetMapping(value = "/displayy")
	public String show() {
		return "Hello world";
	}
	
	@GetMapping(value ="/call/{name}")
	public String add(@PathVariable String name) {
		if(name.equals("Bhavani")) {
			return "same name";
		} else {
			return "different name";
		}
		
	}
	@GetMapping(value = "/adding/{a}/{b}")
	public String adding(@PathVariable int a, @PathVariable int b) {
		int c = a+b;
		return "sum of two numbers "+c;
	}
	
	@GetMapping(value ="/validate")
	public String userValidation(@PathParam ("userName") String userName,@PathParam("password") String password) {
		if(userName.equalsIgnoreCase("Bhavani") && password.equals("Ganga@123")) {
			return "valid details";
		}else {
			return "invalid details";
		}
	}
	

}
