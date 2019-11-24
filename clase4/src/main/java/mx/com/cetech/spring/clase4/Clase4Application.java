package mx.com.cetech.spring.clase4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mx.com.cetech.spring.clase4.service.IHelloService;
import mx.com.cetech.spring.clase4.service.IStudentService;
import mx.com.cetech.spring.clase4.service.impl.EnglishService;
import mx.com.cetech.spring.clase4.service.impl.SpanishService;
import mx.com.cetech.spring.clase4.service.impl.StudentServiceImpl;

@SpringBootApplication
@ComponentScan("mx.com.cetech")
@Configuration
@EntityScan(basePackages = {"mx.com.cetech.spring.clase4.entities"})
public class Clase4Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase4Application.class, args);
		
	}
	
	@Bean
	public IStudentService studentService() {
		return new StudentServiceImpl();
	}
	
	//@Bean
	//@Profile({"es","es-mx"})
	public IHelloService spanishGreeting() {
		return new SpanishService();
	}
	
	//@Bean
	//@Profile({"default","en"})
	public IHelloService englishGreeting() {
		return new EnglishService();
	}

}
