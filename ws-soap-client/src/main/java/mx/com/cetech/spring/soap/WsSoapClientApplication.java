package mx.com.cetech.spring.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
@Configuration
public class WsSoapClientApplication {
	
	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.client.calculator");
		return marshaller;
	}
	
	@Bean
	public AddClient addClient(Jaxb2Marshaller jaxb2Marshaller) {
		AddClient client = new AddClient();
		client.setMarshaller(jaxb2Marshaller);
		client.setUnmarshaller(jaxb2Marshaller);
		client.setDefaultUri("http://156.56.179.164:9763/services");
		return client;
	}

	public static void main(String[] args) {
		SpringApplication.run(WsSoapClientApplication.class, args);
	}

}
