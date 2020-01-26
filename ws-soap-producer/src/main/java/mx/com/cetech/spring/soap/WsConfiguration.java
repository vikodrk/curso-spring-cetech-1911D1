package mx.com.cetech.spring.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WsConfiguration extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> dispatcher(ApplicationContext ctx) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(ctx);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/services/*");
	}
	
	@Bean
	public DefaultWsdl11Definition defaultDefinition( XsdSchema addSchema)
	{
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		
		definition.setPortTypeName("CalculatorHttpsSoap11Endpoint");
		definition.setLocationUri("/services");
		definition.setTargetNamespace("http://c.b.a");
		definition.setSchema(addSchema);
		
		return definition;
	}
	
	@Bean
	public XsdSchema addSchema() {
		return new SimpleXsdSchema(new ClassPathResource("add.xsd"));
	}
}
