package com.example.sample.spring.service;

import org.springframework.stereotype.Service;

@Service
public class VersionService {
	public String getServerVersion() {
		return "2.0.0";
	}
}
