package mx.com.cetech.spring.clase3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetech.spring.clase3.ComponentTest;
import com.cetech.spring.clase3.SingletonPattern;

@RestController
public class Clase3Controller {
	
	@Autowired
	private ComponentTest componentTest;
	
	@GetMapping(value="/test")
	public String testMethod() {
		SingletonPattern singleton = SingletonPattern.getInstance();
		System.out.println(">>>>"+ singleton.instancesCreated());
		return componentTest.test();
	}

}
