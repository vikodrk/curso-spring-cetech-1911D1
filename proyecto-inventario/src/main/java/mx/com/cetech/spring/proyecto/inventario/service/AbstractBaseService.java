package mx.com.cetech.spring.proyecto.inventario.service;

import mx.com.cetech.spring.proyecto.inventario.exception.custom.NotDataFoundException;

public abstract class AbstractBaseService {
	
	protected NotDataFoundException buildException(Long id) {
		return new NotDataFoundException(id.toString());
	}

}
