package mx.com.cetech.curso.springhelloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private List<String> users = new ArrayList<>();
	
	@PostMapping(value="/users")
	public ResponseEntity<String> saveuser(@RequestParam String user){
		users.add(user);
		if(user.equals("serious")) {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Location", "http://seriouscat.com/");
			return new ResponseEntity<>(headers,HttpStatus.SEE_OTHER);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value="/users")
	public ResponseEntity<String> existsUser(@RequestParam String user){
		boolean flag = users.contains(user);
		return new ResponseEntity<String>("El usuario "+user+" existe: "+flag, HttpStatus.OK);
	}

}
