package mx.com.cetech.spring.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.client.calculator.Add;
import com.client.calculator.AddResponse;

public class AddClient extends WebServiceGatewaySupport {

	public AddResponse call(Add add) {
		return (AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:9091/services/Calculator.CalculatorHttpSoap11Endpoint", add);
	}

}
