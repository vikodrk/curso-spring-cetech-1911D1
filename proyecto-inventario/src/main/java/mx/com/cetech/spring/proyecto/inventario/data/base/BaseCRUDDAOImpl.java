package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseCRUDDAOImpl<E extends Serializable, ID extends Serializable>
		extends BaseNonAdministrableDAOImpl<E, ID> {

	public BaseCRUDDAOImpl(JpaRepository<E, ID> repository) {
		super(repository);
	}

	@Transactional
	public void save(E entity) {
		repository.save(entity);
	}

	@Transactional
	public E saveAndFlush(E entity) {
		return repository.saveAndFlush(entity);
	}

	@Transactional
	public void saveAll(List<E> entities) {
		repository.saveAll(entities);
	}

	@Transactional
	public void update(ID id, E newData) {
		E entity = findByID(id);
		BeanUtils.copyProperties(newData, entity);
		repository.save(entity);
	}

	@Transactional
	public void delete(ID id) {
		repository.deleteById(id);
	}

}
