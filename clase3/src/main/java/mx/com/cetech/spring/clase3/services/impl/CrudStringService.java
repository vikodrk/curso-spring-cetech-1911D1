package mx.com.cetech.spring.clase3.services.impl;

import mx.com.cetech.spring.clase3.services.ICrudService;

public class CrudStringService implements ICrudService {

	@Override
	public Object create(Object obj) {
		String outPut = "La cadena ingresada es "+obj;
		return outPut.toUpperCase();
	}

}
