package mx.com.cetech.spring.proyecto.inventario.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cetech.spring.proyecto.inventario.data.dao.IProductCategoryDAO;
import mx.com.cetech.spring.proyecto.inventario.model.mapper.EntitiesMapper;
import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;
import mx.com.cetech.spring.proyecto.inventario.service.AbstractBaseService;
import mx.com.cetech.spring.proyecto.inventario.service.IProductCategoryService;

public class ProductCategoryServiceImpl extends AbstractBaseService implements IProductCategoryService {
	
	@Autowired
	private IProductCategoryDAO productCategoryDAO;
	
	@Autowired
	private EntitiesMapper mapper;

	@Override
	public CatalogTO findCategoryById(Long id) {
		return mapper.mapProductCategory(productCategoryDAO.findByID(id));
	}

	@Override
	public List<CatalogTO> findAllCategories() {
		return productCategoryDAO.findAll().stream().map(mapper::mapProductCategory).collect(Collectors.toList());
	}

	@Override
	public Number suma(String a, String b) {
		return Long.valueOf(a)+Long.valueOf(b);
	}

}
