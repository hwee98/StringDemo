package com.example.springpoc2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpoc2.model.Student;
import com.example.springpoc2.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		System.out.println("hellooooo");
		this.studentService = studentService;
	}
	
	@PostMapping("/student")
	public void createStudent (@RequestBody Student student) {
		studentService.createStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}
