package mx.com.cetech.spring.proyecto.inventario.service;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import mx.com.cetech.spring.proyecto.inventario.ProyectoInventarioApplication;
import mx.com.cetech.spring.proyecto.inventario.model.to.CatalogTO;

@SpringBootTest
@ActiveProfiles("test")
@PropertySource("classpath:/application-test.properties")
@ContextConfiguration(classes = {ProyectoInventarioApplication.class})
public class ProductCategoryServiceTest {
	
	@Autowired
	private IProductCategoryService productCategoryService;

	@Test
	public void testFindCategoryById() {
		CatalogTO category = productCategoryService.findCategoryById(1l);
		Assert.assertNotNull(category);
	}

	@Test
	public void testFindAllCategories() {
		List<CatalogTO> categories = productCategoryService.findAllCategories();
		Assert.assertNotNull(categories);
	}

	@Test
	public void testSuma() {
		Number resultado = productCategoryService.suma("1", "1");
		Assert.assertEquals(2l, resultado.longValue());
	}

}
