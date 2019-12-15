package mx.com.cetech.spring.proyecto.inventario.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import mx.com.cetech.spring.proyecto.inventario.ProyectoInventarioApplication;

@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = ProyectoInventarioApplication.class)
@PropertySource("classpath:/application-test.properties")
public class IRoleServiceTest {
	
	@Autowired
	private IRoleService roleService;

	@Test
	public void testFindRoleById() {
		Assert.assertNotNull(roleService.findRoleById(1l));
	}

	@Test
	public void testFindAllRoles() {
		Assert.assertFalse(roleService.findAllRoles().isEmpty());
	}

}
