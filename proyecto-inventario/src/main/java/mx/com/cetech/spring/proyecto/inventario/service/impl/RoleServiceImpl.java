package mx.com.cetech.spring.proyecto.inventario.service.impl;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cetech.spring.proyecto.inventario.data.dao.IRoleDAO;
import mx.com.cetech.spring.proyecto.inventario.exception.custom.NotDataFoundException;
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
		Supplier<NotDataFoundException> notFoundSup = () -> buildException(id);
		return mapper.mapRole(roleDAO.findByID(id).orElseThrow(notFoundSup));
	}

	@Override
	public List<CatalogTO> findAllRoles() {
		return roleDAO.findAll().stream().map(mapper::mapRole).collect(Collectors.toList());
	}

}
