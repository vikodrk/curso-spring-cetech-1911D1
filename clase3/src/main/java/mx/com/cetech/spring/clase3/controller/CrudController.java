package mx.com.cetech.spring.clase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cetech.spring.clase3.services.ICrudService;

@RestController
public class CrudController {
	
	@Autowired
	@Qualifier("lowerService")
	private ICrudService lower;
	
	@Autowired
	@Qualifier("upperService")
	private ICrudService upper;
	
	@GetMapping(value = "/lower/{input}")
	public Object lowerServiceCall( @PathVariable String input) {
		return lower.create(input);
	}
	
	@GetMapping(value="/upper/{input}")
	public Object upperServiceCall( @PathVariable String input ) {
		return upper.create(input);
	}

}
