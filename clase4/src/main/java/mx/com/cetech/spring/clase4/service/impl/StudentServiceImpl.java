package mx.com.cetech.spring.clase4.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.cetech.spring.clase4.StudentTO;
import mx.com.cetech.spring.clase4.entities.Student;
import mx.com.cetech.spring.clase4.repository.IStudentRepository;
import mx.com.cetech.spring.clase4.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public void saveStudent(StudentTO studentTO) {

		Student student = new Student();

		student.setId(studentTO.getId());
		student.setLastname(studentTO.getLastname());
		student.setName(studentTO.getName());

		try {
			student.setBirthdate(new SimpleDateFormat("dd/MM/yyyy").parse(studentTO.getBirthdate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studentRepository.save(student);

	}

	@Override
	public void updateStudent(Long idStudent, StudentTO studentTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StudentTO> getAllStudents() {

		Function<Student, StudentTO> studentMapper = student -> {
			StudentTO studentTO = new StudentTO();

			studentTO.setId(student.getId());
			studentTO.setName(student.getName());
			studentTO.setLastname(student.getLastname());
			studentTO.setBirthdate(new SimpleDateFormat("dd/MM/yyyy").format(student.getBirthdate()));
			return studentTO;
		};

		return studentRepository.findAll().stream().map(studentMapper).collect(Collectors.toList());
	}

}
