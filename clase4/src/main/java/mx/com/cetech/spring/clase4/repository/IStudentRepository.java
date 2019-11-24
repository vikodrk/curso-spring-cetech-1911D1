package mx.com.cetech.spring.clase4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.clase4.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}
