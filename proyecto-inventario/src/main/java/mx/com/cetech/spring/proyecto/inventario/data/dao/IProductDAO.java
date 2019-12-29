package mx.com.cetech.spring.proyecto.inventario.data.dao;

import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.proyecto.inventario.data.base.IBaseCRUDDAO;
import mx.com.cetech.spring.proyecto.inventario.model.entity.Products;

@Repository
public interface IProductDAO extends IBaseCRUDDAO<Products, Long> {

}
