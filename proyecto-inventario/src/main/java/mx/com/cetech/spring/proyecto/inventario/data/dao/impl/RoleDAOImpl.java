package mx.com.cetech.spring.proyecto.inventario.data.dao.impl;

import mx.com.cetech.spring.proyecto.inventario.data.base.BaseNonAdministrableDAOImpl;
import mx.com.cetech.spring.proyecto.inventario.data.dao.IRoleDAO;
import mx.com.cetech.spring.proyecto.inventario.data.repository.IRoleRepository;
import mx.com.cetech.spring.proyecto.inventario.model.entity.Roles;

public class RoleDAOImpl extends BaseNonAdministrableDAOImpl<Roles, Long> implements IRoleDAO {

	public RoleDAOImpl(IRoleRepository repository) {
		super(repository);
	}

	
}
