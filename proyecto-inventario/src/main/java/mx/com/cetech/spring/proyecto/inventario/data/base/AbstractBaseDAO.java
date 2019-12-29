package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;

import mx.com.cetech.spring.proyecto.inventario.exception.custom.NotDataFoundException;

public abstract class AbstractBaseDAO<ID extends Serializable> {
	
	protected NotDataFoundException buildException(ID id) {
		return new NotDataFoundException(id.toString());
	}

}
