package com.example.sample.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@JsonProperty("student_id")
	@Column(name = "studentId")
	private String studentId;
	
	@JsonProperty("first_name")
	@Column(name = "firstName")
	private String firstName;
	
	@JsonProperty("surname")
	@Column(name = "surname")
	private String surname;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
