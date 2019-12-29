package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public abstract class BaseNonAdministrableDAOImpl<E extends Serializable, ID extends Serializable>
		extends AbstractBaseDAO<ID> {

	protected JpaRepository<E, ID> repository;

	public BaseNonAdministrableDAOImpl(JpaRepository<E, ID> repository) {
		this.repository = repository;
	}

	@Transactional(readOnly = true)
	public E findByID(ID id) {
		return repository.findById(id).orElseThrow(() -> buildException(id));
	}

	@Transactional(readOnly = true)
	public List<E> findAll() {
		return repository.findAll();
	}

}
