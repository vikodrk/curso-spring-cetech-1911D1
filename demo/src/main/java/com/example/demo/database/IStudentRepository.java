package com.example.demo.database;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
	
	@Query(name="Student.findByNameLike",value = "SELECT e FROM Student e WHERE UPPER(e.name) LIKE UPPER(:name) ORDER BY e.id ")
	Optional<List<Student>> findByNameLike(@Param("name")String name);
	
	Optional<List<Student>> findByLastname(String lastname);

}
