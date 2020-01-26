package mx.com.cetech.spring.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.client.calculator.Add;
import com.client.calculator.AddResponse;

@Endpoint
public class AddEndpoint {
	
	@PayloadRoot(namespace = "http://c.b.a", localPart = "add")
	@ResponsePayload
	public AddResponse addAction( @RequestPayload Add add) {
		AddResponse response = new AddResponse();
		response.setReturn(add.getN1()+add.getN2());
		return response;
	}

}
