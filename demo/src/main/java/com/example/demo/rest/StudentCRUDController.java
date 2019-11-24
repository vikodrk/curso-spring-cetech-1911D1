package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.IStudentRepository;
import com.example.demo.model.Student;

@RestController
public class StudentCRUDController {
	
	@Autowired
	private IStudentRepository studentRepository;
	
	@PostMapping(value="/students")
	public void createStudent(@RequestBody Student student) {
		studentRepository.saveAndFlush(student);
	}
	
	@GetMapping(value="/students")
	public List<Student> read(){
		return studentRepository.findAll();
	}
	
	@GetMapping(value="/students/{id}")
	public Student readById(@PathVariable("id")Long id) {
		return studentRepository.findById(id).orElseGet(Student::new);
	}
	
	@GetMapping(value="/students/name")
	public List<Student> readByName(@RequestParam(value="name")String name) {
		return studentRepository.findByNameLike("%"+name+"%").orElseGet(ArrayList::new);
	}
	
	@GetMapping(value="/students/lastname")
	public List<Student> readByLastname(@RequestParam(value="lastname")String lastname) {
		return studentRepository.findByLastname(lastname).orElseGet(ArrayList::new);
	}
	
	@PutMapping(value="/students/{id}")
	public void updateStudent(@PathVariable("id")Long id, @RequestBody Student data) {
		Student entityToUpdate = studentRepository.findById(id).orElseThrow(RuntimeException::new);
		
		entityToUpdate.setCurp(data.getCurp());
		entityToUpdate.setLastname(data.getLastname());
		entityToUpdate.setName(data.getName());
		entityToUpdate.setBirthdate(data.getBirthdate());
		
		studentRepository.saveAndFlush(entityToUpdate);
		
	}
	
	@DeleteMapping(value="/students/{id}")
	public void deleteStudent(@PathVariable("id")Long id) {
		studentRepository.deleteById(id);
	}

}
