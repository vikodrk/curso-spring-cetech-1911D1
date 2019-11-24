package mx.com.cetech.spring.clase4.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cetech.spring.clase4.service.IHelloService;

@RestController
public class HelloProfileController {
	
	@Value("${mx.com.cetech.value.propertie}")
	private String valor;
	
	@Autowired
	private IHelloService helloService;
	
	@GetMapping(value="/helloProfile")
	public String helloProfile() {
		return valor;
	}
	
	@GetMapping(value="/greeting")
	public String greeting() {
		return helloService.greeting();
	}

}
