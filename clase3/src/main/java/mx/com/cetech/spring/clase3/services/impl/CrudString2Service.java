package mx.com.cetech.spring.clase3.services.impl;

import mx.com.cetech.spring.clase3.services.ICrudService;

public class CrudString2Service implements ICrudService {

	@Override
	public Object create(Object obj) {
		String output = "El string ingresado fue "+obj;
		return output.toLowerCase();
	}

}
