package com.logesh.JPATest.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.logesh.JPATest.student.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
