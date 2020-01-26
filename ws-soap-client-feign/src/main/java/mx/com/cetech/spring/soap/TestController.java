package mx.com.cetech.spring.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private ISoapClient soapClient;
	
	@GetMapping("/call")
	public ResponseEntity<String> call(){
		String body="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:c=\"http://c.b.a\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <c:add>\n" + 
				"         <c:n1>6</c:n1>\n" + 
				"         <c:n2>6</c:n2>\n" + 
				"      </c:add>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		return new ResponseEntity<>(soapClient.call(body), HttpStatus.OK);
	}

}
