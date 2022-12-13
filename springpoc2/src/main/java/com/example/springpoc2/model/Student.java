package com.example.springpoc2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	private String name;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Student() {
		
	}
	
	public Student(String name, Long id) {
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
