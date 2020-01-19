package mx.com.cetech.spring.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface IEurekaClient {
	
	@GetMapping("/hello")
	String hello();

}
