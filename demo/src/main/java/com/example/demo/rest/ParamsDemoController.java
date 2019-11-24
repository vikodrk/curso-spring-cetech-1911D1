package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsDemoController {
	
	@GetMapping(value="/greetin/{name}")
	public String greeting(@PathVariable("name")String name) {
		return "Hola "+name+" bienvenido a Spring Boot Web";
	}
	
	@GetMapping(value="/greetin")
	public String greetinByRequestParam(@RequestParam(value="nombre",required=false)String name) {
		return "Hola "+name+" bienvenido a Spring Boot Web. Tu nombre esta ingresando por request param.";
	}

}
