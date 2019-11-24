package com.example.demo.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@GetMapping(value="/hello")
	public String hello() {
		return "Hola mundo!";
	}
	
	@PostMapping(value="/hello")
	public String helloPost() {
		return "Hola mundo vía post!";
	}
	
	@GetMapping(value="/today")
	public Date today() {
		return new Date();
	}

}
