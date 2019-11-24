package mx.com.cetech.spring.clase4.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mx.com.cetech.spring.clase4.service.IHelloService;

@Service
@Profile({"es","es-mx"})
public class SpanishService implements IHelloService {

	@Override
	public String greeting() {
		return "Hola, esto es un saludo en espaniol";
	}

}
