package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ILoginService;

@RestController
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@Value("${com.example.demo.props.label}")
	private String label;
	
	@PostMapping(value = "/login")
	public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password) {
		if (loginService.login(name, password)) {
			return "Hola " + name + " bienvenido "+label;
		} else {
			return "Inicio inválido.";
		}
	}

}
