package mx.com.cetech.spring.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/call")
	public @ResponseBody String hello() {
		return restTemplate.getForObject("http://eureka-client/hello", String.class);
	}

}
