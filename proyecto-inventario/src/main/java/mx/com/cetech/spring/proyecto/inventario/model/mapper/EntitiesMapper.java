package mx.com.cetech.spring.proyecto.inventario.model.mapper;

import org.springframework.stereotype.Component;

import mx.com.cetech.spring.proyecto.inventario.model.entity.ProductCategory;
import mx.com.cetech.spring.proyecto.inventario.model.entity.Roles;
import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;

@Component
public class EntitiesMapper {
	
	public CatalogTO mapProductCategory(ProductCategory entity) {
		return CatalogTO.builder().id(entity.getId()).description(entity.getDescription()).build();
	}
	
	public CatalogTO mapRole(Roles entity) {
		return CatalogTO.builder().id(entity.getIdRole()).description(entity.getDescription()).build();
	}

}
