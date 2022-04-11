package com.example.demo.Interface;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
@Service
public interface Employeerepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findById(int empId);

	Employee getOne(int EmpId);
}
