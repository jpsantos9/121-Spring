package com.example.sample.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.spring.model.Student;
import com.example.sample.spring.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("getStudents")
	public List<Student> getStudentsList() {
		return studentService.getAllStudentsList();
	}
	
	@PostMapping("addStudent")
	public ResponseEntity<Void> addStudent(@RequestBody Student request) {
		studentService.saveStudent(request);
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("searchStudent")
	public List<Student> searchStudentName(@RequestParam("searchKey") String searchKey) {
		return studentService.searchStudentByName(searchKey);
	}
	
	@GetMapping("studentInfo/{studentId}")
	public Student getStudentInfo(@PathVariable String studentId) {
		return studentService.getStudentInfo(studentId);
	}
}
