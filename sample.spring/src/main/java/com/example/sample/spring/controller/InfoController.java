package com.example.sample.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.spring.service.VersionService;

/*
 * the rest controller is where you place all your api
 */
@RestController
public class InfoController {
	@Autowired
	VersionService versionService;
	
	@GetMapping("version")
	public String getVersion() {
		return versionService.getServerVersion();
	}
}
