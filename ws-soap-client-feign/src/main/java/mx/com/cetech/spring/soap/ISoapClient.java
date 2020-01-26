package mx.com.cetech.spring.soap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:9091/services", name="feignSoap")
public interface ISoapClient {
	
	@PostMapping(value = "/Calculator.CalculatorHttpSoap11Endpoint", consumes = MediaType.TEXT_XML_VALUE, produces = MediaType.TEXT_XML_VALUE)
	String call(String body);

}
