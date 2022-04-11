package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.Id;


	@Entity
	public class Employee {
		@Id
		int EmpId;
		String Name;
		String Department;
		int Salary;
		public Employee(int empId, String name, String department, int salary) {
			super();
			EmpId = empId;
			Name = name;
			Department = department;
			Salary = salary;
		}
		public Employee() {
			super();
			
		}

		public int getEmpId() {
			return EmpId;
		}
		public void setEmpId(int empId) {
			EmpId = empId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public int getSalary() {
			return Salary;
		}
		public void setSalary(int salary) {
			Salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [EmpId=" + EmpId + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary
					+ "]";
	}
	}

