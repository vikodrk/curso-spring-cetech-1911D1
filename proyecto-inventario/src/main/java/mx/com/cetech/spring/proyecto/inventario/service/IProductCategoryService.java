package mx.com.cetech.spring.proyecto.inventario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;

@Service
public interface IProductCategoryService {
	
	CatalogTO findCategoryById(Long id);
	
	List<CatalogTO> findAllCategories();
	
	Number suma(String a, String b);

}
