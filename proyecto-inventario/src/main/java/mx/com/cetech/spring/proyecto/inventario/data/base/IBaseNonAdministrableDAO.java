package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IBaseNonAdministrableDAO <E extends Serializable, ID extends Serializable> {
	
	Optional<E> findByID(ID id);
	
	List<E> findAll();

}
