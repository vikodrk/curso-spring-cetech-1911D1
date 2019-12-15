package mx.com.cetech.spring.proyecto.inventario.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.proyecto.inventario.model.entity.ProductCategory;

@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
