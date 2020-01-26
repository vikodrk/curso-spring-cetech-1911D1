package mx.com.cetech.spring.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WsSoapClientFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsSoapClientFeignApplication.class, args);
	}

}
