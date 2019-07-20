package com.logesh.JPATest.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logesh.JPATest.student.model.Student;
import com.logesh.JPATest.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("students")
	public List<Student> getAllStudents() {
		System.out.println("here at stu con");
		return service.getAll();
	}

	@RequestMapping("add/{name}")
	public Student addStudent(@PathVariable String name) {
		System.out.println("here at get stu ");
		return service.addStudent(name);
	}

}
