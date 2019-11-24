package mx.com.cetech.spring.clase4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.cetech.spring.clase4.StudentTO;

@Service
public interface IStudentService {
	
	/**
	 * El metodo realiza un guardado de un nuevo registro
	 * @param studentTO
	 */
	void saveStudent(StudentTO studentTO);
	
	/**
	 * El metodo realiza la actualizacion de un registro. El atributo id se considera como el id del registro a actualizar
	 * y studentTO se utiliza como dato transporte de las propiedades nuevas.
	 * @param idStudent
	 * @param studentTO
	 */
	void updateStudent(Long idStudent,StudentTO studentTO);
	
	List<StudentTO> getAllStudents();

}
