package com.logesh.JPATest.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logesh.JPATest.student.model.Student;
import com.logesh.JPATest.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

//	@Autowired
//	StudentDAO dao;


	/*TRADITIONAL MTD USING DAO 
	 * public Student addStudent(String name) {
	 * System.out.println("Adding a student with name: " + name);
	 * dao.addStudent(name); // Optional<Student> student = repository.findById(id);
	 * // System.out.println("Found student: " + student); // return
	 * repository.findById(id).orElse(null); return null; }
	 */
	public Student addStudent(String name) {
		System.out.println("Adding a student with name: " + name);
		repository.save(new Student( name));
//		Optional<Student> student = repository.findById(id);
//		System.out.println("Found student: " + student);
//		return repository.findById(id).orElse(null);
		return null;
	}

	public List<Student> getAll() {
		System.out.println("Here at all call");
		List<Student> stds = new ArrayList<Student>();
		repository.findAll().forEach(stds::add);
		return stds;
	}

}
