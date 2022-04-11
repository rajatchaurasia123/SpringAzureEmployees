package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringAzureEmployeesApplication {
	@GetMapping("/message")
	public String message() {
		return "Welcome To My Employee Details Project in Azure platform";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureEmployeesApplication.class, args);
	}

}
