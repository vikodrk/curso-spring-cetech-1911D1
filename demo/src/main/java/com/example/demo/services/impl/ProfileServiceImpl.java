package com.example.demo.services.impl;

import com.example.demo.services.IProfileService;

public class ProfileServiceImpl implements IProfileService {

	@Override
	public String profile() {
		return "default";
	}

}
