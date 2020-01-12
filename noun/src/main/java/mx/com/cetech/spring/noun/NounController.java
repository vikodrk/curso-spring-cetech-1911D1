package mx.com.cetech.spring.noun;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NounController {

	@Value("${noun.list}")
	private String nouns;

	@Autowired
	private IVerbsClient verbsClient;

	@GetMapping("/noun")
	public @ResponseBody String noun() {
		RestTemplate restTemplate = new RestTemplate();
		String verbs = restTemplate.getForObject("http://localhost:8181/verb", String.class);
		return new StringBuilder("Nouns: ").append(nouns).append(" and the actions they can do: ").append(verbs)
				.toString();
	}

	@GetMapping("/noun/list")
	public @ResponseBody String nounList() {
		RestTemplate restTemplate = new RestTemplate();
		List<VerbResponse> verbs = restTemplate.getForObject("http://localhost:8181/verb/list", List.class);
		return new StringBuilder("Nouns: ").append(nouns).append(" and the actions they can do: ").append(verbs)
				.toString();
	}

	@GetMapping("/noun/list/feign")
	public @ResponseBody String nounListFeign() {
		List<VerbResponse> verbs = verbsClient.verbs();
		return new StringBuilder("Nouns: ").append(nouns).append(" and the actions they can do: ").append(verbs)
				.toString();
	}

}
