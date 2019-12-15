package mx.com.cetech.spring.proyecto.inventario.data.base;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public class BaseNonAdministrableDAOImpl<E extends Serializable, ID extends Serializable> {

	protected JpaRepository<E, ID> repository;

	public BaseNonAdministrableDAOImpl(JpaRepository<E, ID> repository) {
		this.repository = repository;
	}

	public Optional<E> findByID(ID id) {
		return repository.findById(id);
	}

	public List<E> findAll() {
		return repository.findAll();
	}

}
