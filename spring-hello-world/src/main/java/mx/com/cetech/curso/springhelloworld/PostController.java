package mx.com.cetech.curso.springhelloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@PostMapping(value="/post/example/{name}")
	public String postExample( @PathVariable String name) {
		return "Esto fue una petición post de "+name;
	}
	
	@PostMapping(value="/post/byquery")
	public String postByParam( @RequestParam String name) {
		return "Esto fue una petición post con query param de "+name;
	}

}
