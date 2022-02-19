package com.example.sample.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.spring.model.Student;
import com.example.sample.spring.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	public List<Student> getAllStudentsList() {
		return studentRepo.findAll();
	}
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}
	
	public List<Student> searchStudentByName(String searchKey) {
		return studentRepo.findBySurnameOrFirstNameContaining(searchKey, searchKey);
	}
	
	public Student getStudentInfo(String studentId) {
		return studentRepo.findById(studentId).get();
	}
	
}
