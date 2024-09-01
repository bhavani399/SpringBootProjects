package com.example.demo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController  // request and response
public class SampleExample {
	
	@GetMapping(value = "/display") // get the data
	public String show() {
		return "Hello World";
	}
	
	@GetMapping()
	public int add() {
		int a = 10;
		int b= 20;
		int c = a+b;
		return c;
	}
	
	@GetMapping(value ="/sum/{num1}/{num2}")
	public String addingnumbers(@PathVariable int num1,@PathVariable int num2) {
		int c= num1+num2;
		return "total value "+c;
	}
	
	@GetMapping(value = "/validate/{userName}/{password}")
	public String validateUser(@PathVariable String userName , @PathVariable String password) {
		if(userName.equalsIgnoreCase("Bhavani") && password.equals("Ganga@123")) {
			return "valid user";
		}else {
			return "Invalid User";
		}
	}
	
	@GetMapping(value= "/vowels")
	public String vowel(@PathParam ("") String vowelValue) {
		if(vowelValue.contains("a")||vowelValue.contains("e")||vowelValue.contains("i")||vowelValue.contains("o")||vowelValue.contains("u")) {
			return vowelValue+" Contains Vowel";
		} else {
			return vowelValue+" not Contains Vowel";
		}
	}
	@GetMapping(value = "/show")
	public String showDetails(@PathParam ("") String name1, @PathParam ("") String name2) {
		return name1+name2;
	}
	}
 	 	