package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Value;

import com.example.demo.services.ILoginService;

public class LoginServiceImpl implements ILoginService {
	
	@Value("${com.example.demo.props.user}")
	private String user;
	
	@Value("${com.example.demo.props.password}")
	private String password;

	@Override
	public boolean login(String name, String password) {
		return name.equals(user)&&password.equals(password);
	}

}
