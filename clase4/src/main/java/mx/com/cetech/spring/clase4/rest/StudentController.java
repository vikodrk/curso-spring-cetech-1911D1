package mx.com.cetech.spring.clase4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.cetech.spring.clase4.StudentTO;
import mx.com.cetech.spring.clase4.service.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	@PostMapping(value="/students")
	public String saveStudent( @RequestBody StudentTO student) {
		studentService.saveStudent(student);
		return "Student saved!";
	}
	
	@GetMapping(value="/students")
	public List<StudentTO> listAllStudents(){
		return studentService.getAllStudents();
	}

}
