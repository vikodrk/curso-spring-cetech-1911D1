package mx.com.cetech.spring.proyecto.inventario.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cetech.spring.proyecto.inventario.data.dao.IRoleDAO;
import mx.com.cetech.spring.proyecto.inventario.model.mapper.EntitiesMapper;
import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;
import mx.com.cetech.spring.proyecto.inventario.service.AbstractBaseService;
import mx.com.cetech.spring.proyecto.inventario.service.IRoleService;

public class RoleServiceImpl extends AbstractBaseService implements IRoleService {
	
	@Autowired
	private IRoleDAO roleDAO;
	
	@Autowired
	private EntitiesMapper mapper;

	@Override
	public CatalogTO findRoleById(Long id) {
		return mapper.mapRole(roleDAO.findByID(id));
	}

	@Override
	public List<CatalogTO> findAllRoles() {
		return roleDAO.findAll().stream().map(mapper::mapRole).collect(Collectors.toList());
	}

}
