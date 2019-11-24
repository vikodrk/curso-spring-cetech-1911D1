package mx.com.cetech.curso.springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@GetMapping(value = "/hello")
	public String helloWorld() {
		System.out.println("Hola mundo en la consola");
		return "Hello world!";
	}

	@GetMapping(value = "/greeting/{nombre}")
	public String greetinByName(@PathVariable("nombre") String name) {
		return "Hola " + name;
	}

	@GetMapping(value = "/greetingInQuery")
	public String greetingByQuery(@RequestParam(name = "nombre") String name) {
		return "Hola " + name + " en querystring.";
	}

}
