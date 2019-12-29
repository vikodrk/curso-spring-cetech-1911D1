package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseCRUDDAO<E extends Serializable, ID extends Serializable> extends IBaseNonAdministrableDAO<E, ID> {
	
	void save(E entity);
	
	E saveAndFlush(E entity);
	
	void saveAll(List<E> entities);
	
	void update(ID id, E newData);
	
	void delete(ID id);

}
