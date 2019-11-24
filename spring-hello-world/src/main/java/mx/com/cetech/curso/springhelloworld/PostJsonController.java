package mx.com.cetech.curso.springhelloworld;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostJsonController {

	protected static class Person implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -2881529033885423426L;
		private String name;
		private String lastname;
		private String rfc;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getRfc() {
			return rfc;
		}
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

	}
	
	private List<Person> data = new ArrayList<PostJsonController.Person>();
	
	@GetMapping(value="/persons/{rfc}")
	public ResponseEntity<Person> findByRfc(@PathVariable String rfc){
		Person person = null;
		
		for(Person iterator : data) {
			if(iterator.getRfc().equals(rfc)) {
				person = iterator;
				break;
			}
		}
		
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
	
	@PostMapping(value="/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> savePerson( @RequestBody Person person, @RequestHeader String id){
		System.out.println("Id por header: "+id);
		data.add(person);
		return new ResponseEntity<String>("Persona guardada", HttpStatus.CREATED);
	}

}
