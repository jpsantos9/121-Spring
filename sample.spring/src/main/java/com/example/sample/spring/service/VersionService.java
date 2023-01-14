package com.example.sample.spring.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {
	public String getServerVersion() {
		System.out.println("Someone retrieved the version");
		return "2.0.0";
	}
}
