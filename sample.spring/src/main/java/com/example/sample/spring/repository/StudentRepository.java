package com.example.sample.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.spring.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
	public List<Student> findBySurnameOrFirstNameContaining(String firstNameSearchKey, String surnameSearchKey);
}
