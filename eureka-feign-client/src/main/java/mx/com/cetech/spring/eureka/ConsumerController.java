package mx.com.cetech.spring.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private IEurekaClient eurekaClient;
	
	@GetMapping("/call")
	public @ResponseBody String callToClient() {
		return eurekaClient.hello();
	}

}
