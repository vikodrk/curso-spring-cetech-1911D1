package mx.com.cetech.spring.proyecto.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;

@Service
public interface IRoleService {
	
	CatalogTO findRoleById(Long id);
	
	List<CatalogTO> findAllRoles();

}
