package com.example.demo.controller;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.UserRepository;

@RestController
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class LoginController {

	@GetMapping("/home")
	public String home() {
		return "welcome home";
	}
	
	@GetMapping("/user")
	public String user() {
		return "welcome user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "welcome admin";
	}
}
