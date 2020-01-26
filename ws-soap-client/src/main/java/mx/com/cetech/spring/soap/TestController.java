package mx.com.cetech.spring.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.calculator.Add;

@RestController
public class TestController {
	
	@Autowired
	private AddClient client;

	@GetMapping("/call")
	public ResponseEntity<Object> call() {

		Add add = new Add();
		add.setN1(1);
		add.setN2(2);
		return new ResponseEntity<Object>(client.call(add), HttpStatus.OK);
	}

}
