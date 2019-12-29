package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseNonAdministrableDAO <E extends Serializable, ID extends Serializable> {
	
	E findByID(ID id);
	
	List<E> findAll();

}
