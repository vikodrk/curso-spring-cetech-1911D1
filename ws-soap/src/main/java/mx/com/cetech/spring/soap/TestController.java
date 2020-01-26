package mx.com.cetech.spring.soap;

import javax.xml.ws.BindingProvider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.ws.developer.WSBindingProvider;

import a.b.c.Calculator;
import a.b.c.CalculatorPortType;

@RestController
public class TestController {

	@GetMapping("/call")
	public ResponseEntity<Object> callWs() {
		Calculator calculator = new Calculator();
		CalculatorPortType portType = calculator.getCalculatorHttpSoap11Endpoint();
		BindingProvider bindingProvider = (WSBindingProvider) portType;
		bindingProvider.getRequestContext().put(WSBindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:9091/services/Calculator.CalculatorHttpSoap11Endpoint/");
		return new ResponseEntity<Object>(portType.add(1, 1), HttpStatus.OK);
	}

}
