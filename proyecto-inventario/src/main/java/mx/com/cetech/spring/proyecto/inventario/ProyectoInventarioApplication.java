package mx.com.cetech.spring.proyecto.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"mx.com.cetech.spring.proyecto.inventario"})
public class ProyectoInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoInventarioApplication.class, args);
	}

}
