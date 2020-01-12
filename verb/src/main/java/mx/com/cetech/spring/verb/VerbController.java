package mx.com.cetech.spring.verb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerbController {

	@Value("${verb.list}")
	private String line;

	@GetMapping(value = "/verb")
	public @ResponseBody String verb() {

		return line;

	}

	@GetMapping("/verb/list")
	public List<Verb> verbs() {
		return Stream.of(line.trim().split(","))
				.map(
						line -> Verb.builder()
						.action(line)
						.lenguage("en")
						.build()
						)
				.collect(Collectors.toList());
	}

}
