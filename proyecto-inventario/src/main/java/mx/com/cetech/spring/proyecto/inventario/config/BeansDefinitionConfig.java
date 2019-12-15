package mx.com.cetech.spring.proyecto.inventario.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.cetech.spring.proyecto.inventario.data.dao.IProductCategoryDAO;
import mx.com.cetech.spring.proyecto.inventario.data.dao.IRoleDAO;
import mx.com.cetech.spring.proyecto.inventario.data.dao.impl.ProductCategoryDAOImpl;
import mx.com.cetech.spring.proyecto.inventario.data.dao.impl.RoleDAOImpl;
import mx.com.cetech.spring.proyecto.inventario.data.repository.IProductCategoryRepository;
import mx.com.cetech.spring.proyecto.inventario.data.repository.IRoleRepository;
import mx.com.cetech.spring.proyecto.inventario.service.IProductCategoryService;
import mx.com.cetech.spring.proyecto.inventario.service.IRoleService;
import mx.com.cetech.spring.proyecto.inventario.service.impl.ProductCategoryServiceImpl;
import mx.com.cetech.spring.proyecto.inventario.service.impl.RoleServiceImpl;

@Configuration
public class BeansDefinitionConfig {

	@Bean
	public IProductCategoryService productCategoryService() {
		return new ProductCategoryServiceImpl();
	}
	
	@Bean
	public IRoleService roleService() {
		return new RoleServiceImpl();
	}

	@Bean
	public IProductCategoryDAO productCategoryDAO(@Autowired IProductCategoryRepository repository) {
		return new ProductCategoryDAOImpl(repository);
	}
	
	@Bean
	public IRoleDAO roleDAO( @Autowired IRoleRepository repository) {
		return new RoleDAOImpl(repository);
	}

}
