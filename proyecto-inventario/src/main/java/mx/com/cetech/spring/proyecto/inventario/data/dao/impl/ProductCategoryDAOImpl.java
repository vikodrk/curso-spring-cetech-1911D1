package mx.com.cetech.spring.proyecto.inventario.data.dao.impl;

import mx.com.cetech.spring.proyecto.inventario.data.base.BaseNonAdministrableDAOImpl;
import mx.com.cetech.spring.proyecto.inventario.data.dao.IProductCategoryDAO;
import mx.com.cetech.spring.proyecto.inventario.data.repository.IProductCategoryRepository;
import mx.com.cetech.spring.proyecto.inventario.model.entity.ProductCategory;

public class ProductCategoryDAOImpl extends BaseNonAdministrableDAOImpl<ProductCategory, Long> implements IProductCategoryDAO {

	public ProductCategoryDAOImpl(IProductCategoryRepository repository) {
		super(repository);
	}

}
