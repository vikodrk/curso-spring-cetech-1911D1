package mx.com.cetech.spring.noun;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8181", name = "Verbs")
public interface IVerbsClient {
	
	@GetMapping("/verb/list")
	List<VerbResponse> verbs();

}
