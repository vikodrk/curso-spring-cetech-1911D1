package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface ILoginService {
	
	boolean login(String name, String password);

}
