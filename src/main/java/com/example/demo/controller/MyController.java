package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Interface.Employeerepo;
import com.example.demo.entity.Employee;
@RestController
public class MyController {
	
	@Autowired
	Employeerepo repo;
	@GetMapping("/")
	public String home() {
		return "hello";
	    }

	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return repo.findAll();
	     }
	@RequestMapping("/employee/{EmpId}")
	public Optional<Employee> getEmployee(@PathVariable("EmpId") int EmpId){
		return repo.findById(EmpId);
	     }
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee){
		return repo.save(employee);
	   }
	@PutMapping(path="/employee",consumes= {"application/json"})
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee)
	{
		repo.save(employee);
		return employee;
	}
	@DeleteMapping("/employee/{EmpId}")
	public String deleteEmployee(@PathVariable int EmpId) 
	{
		Employee a = repo.getOne(EmpId);
		repo.delete( a);

		return "delete";
		
	}

	}


