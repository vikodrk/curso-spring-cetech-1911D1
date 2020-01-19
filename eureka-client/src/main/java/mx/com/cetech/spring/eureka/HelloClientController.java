package mx.com.cetech.spring.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClientController {
	
	@GetMapping(value="/hello")
	public @ResponseBody String hello() {
		return "Cliente eureka..!";
	}
}
