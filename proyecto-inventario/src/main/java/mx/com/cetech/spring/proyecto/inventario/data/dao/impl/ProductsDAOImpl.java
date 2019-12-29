package mx.com.cetech.spring.proyecto.inventario.data.dao.impl;

import mx.com.cetech.spring.proyecto.inventario.data.base.BaseCRUDDAOImpl;
import mx.com.cetech.spring.proyecto.inventario.data.dao.IProductDAO;
import mx.com.cetech.spring.proyecto.inventario.data.repository.IProductRepository;
import mx.com.cetech.spring.proyecto.inventario.model.entity.Products;

public class ProductsDAOImpl extends BaseCRUDDAOImpl<Products, Long> implements IProductDAO {

	public ProductsDAOImpl(IProductRepository repository) {
		super(repository);
	}


}
