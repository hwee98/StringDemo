package com.example.springpoc2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.springpoc2.model.Student;
import com.example.springpoc2.repository.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public void createStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Student getStudent(Long id) {
		Optional <Student> studentOptional = studentRepository.findById(id);
		
		Student student = studentOptional.get();
		
		return student;
	}
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
}
