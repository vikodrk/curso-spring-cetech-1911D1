package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.IProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private IProfileService profileService;
	
	@GetMapping(value="/profile")
	public String getProfile() {
		return profileService.profile();
	}

}
