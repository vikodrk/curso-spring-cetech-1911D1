package mx.com.cetech.spring.clase3.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@Value("${mx.com.cetech.spring.clase3.secret}")
	private String secret;
	
	@Resource(name = "test-resource")
	private Properties resourceInject;
	
	@Value("classpath:/test-resources.properties")
	private org.springframework.core.io.Resource properties;
	
	@GetMapping("/secret")
	public String secretCall() {
		return secret;
	}
	
	@GetMapping("/secretProps")
	public String secreteFileCall() {
		return resourceInject.getProperty("mx.com.cetech.spring.clase3.secret");
	}
	
	@GetMapping("/secretContent")
	public String fileContent() throws IOException {
		InputStream is = properties.getInputStream();
		StringBuilder builder = new StringBuilder();
		
		try(Reader reader = new BufferedReader(new InputStreamReader(is))) {
			int size = 0;
			while( ( size = reader.read() )!=-1) {
				builder.append((char)size);
			}
		}
		
		return builder.toString();
	}

}
