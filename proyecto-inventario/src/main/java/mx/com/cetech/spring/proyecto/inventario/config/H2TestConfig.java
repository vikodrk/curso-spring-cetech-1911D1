package mx.com.cetech.spring.proyecto.inventario.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
public class H2TestConfig {
	
	@Value("classpath:/h2/init.sql")
	private Resource script;
	
	@Bean
	@Profile("test")
	public DataSourceInitializer datasourceInit(DataSource datasource) {
		DataSourceInitializer initializer = new DataSourceInitializer();
		initializer.setDataSource(datasource);
		initializer.setDatabasePopulator(populator());
		return initializer;
	}
	
	private DatabasePopulator populator() {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(script);
		return populator;
		
	}

}
