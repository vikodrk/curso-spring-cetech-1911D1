package mx.com.cetech.spring.clase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cetech.spring.clase3.services.ServiceSpringExample;

@RestController
public class TestController {
	
	@Autowired
	private ServiceSpringExample service;
	
	@GetMapping(value="/testService")
	public String testService() {
		return service.testService();
	}

}
