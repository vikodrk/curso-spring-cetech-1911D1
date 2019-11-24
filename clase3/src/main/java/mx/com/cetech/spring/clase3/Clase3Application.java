package mx.com.cetech.spring.clase3;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mx.com.cetech.spring.clase3.services.ICrudService;
import mx.com.cetech.spring.clase3.services.impl.CrudString2Service;
import mx.com.cetech.spring.clase3.services.impl.CrudStringService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.cetech.spring.clase3", "mx.com.cetech.spring.clase3" })
@Configuration
public class Clase3Application {
	
	@Bean
	@Qualifier("lowerService")
	public ICrudService crudService() {
		return new CrudString2Service();
	}
	
	@Bean
	@Qualifier("upperService")
	public ICrudService crudServiceUpper() {
		return new CrudStringService();
	}
	
	@Bean(name = "test-resource")
	public Properties resourceInject() {
		Properties props = new Properties();
		try {
			props.load(Clase3Application.class
					.getClassLoader().getResourceAsStream("test-resources.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	public static void main(String[] args) {
		SpringApplication.run(Clase3Application.class, args);
	}

}
