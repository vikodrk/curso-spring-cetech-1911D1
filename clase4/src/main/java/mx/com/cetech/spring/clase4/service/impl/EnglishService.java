package mx.com.cetech.spring.clase4.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mx.com.cetech.spring.clase4.service.IHelloService;

@Service
@Profile({"default","en"})
public class EnglishService implements IHelloService {

	@Override
	public String greeting() {
		return "Hello, this is an english greeting";
	}

}
