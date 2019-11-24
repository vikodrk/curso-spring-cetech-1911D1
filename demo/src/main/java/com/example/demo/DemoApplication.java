package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.services.ILoginService;
import com.example.demo.services.IProfileService;
import com.example.demo.services.impl.FarmaciaProfileServiceImpl;
import com.example.demo.services.impl.LoginServiceImpl;
import com.example.demo.services.impl.ProfileServiceImpl;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.example.demo.rest","com.example.demo.services"})
@EntityScan(basePackages = {"com.example.demo.model"})
@EnableJpaRepositories(basePackages = {"com.example.demo.database"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public ILoginService loginService(){
		return new LoginServiceImpl();
	}
	
	@Bean
	@Profile(value="default")
	public IProfileService profileService() {
		return new ProfileServiceImpl();
	}
	
	@Bean
	@Profile(value = "farmacia")
	public IProfileService farmaciaProfileService() {
		return new FarmaciaProfileServiceImpl();
	}

}
