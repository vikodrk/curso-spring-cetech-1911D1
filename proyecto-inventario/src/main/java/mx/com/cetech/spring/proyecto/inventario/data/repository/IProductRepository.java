package mx.com.cetech.spring.proyecto.inventario.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.proyecto.inventario.model.entity.Products;

@Repository
public interface IProductRepository extends JpaRepository<Products, Long> {

}
