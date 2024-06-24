package com.project.rentcar.services;

import java.util.List;
import java.util.Optional;

import com.project.rentcar.models.User;
import com.project.rentcar.repositories.UserRepository;
import com.project.rentcar.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rentcar.models.Employee;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
    UserRepository userRepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}

	//Get employee by Keyword
	public List<Employee> findByKeyword(String keyword) {
		return employeeRepository.findByKeyword(keyword);
	}

	//Set the Username of the employee where firstname and lastname match
	public void assignUsername(int id){
		Employee employee = employeeRepository.findById(id).orElse(null);
		try {
			User user = userRepository.findByFirstnameAndLastname(
					employee.getFirstname(),
					employee.getLastname());
			System.out.println(user);
			employee.setUsername(user.getUsername());
			employeeRepository.save(employee);
		}
		catch (Exception ex){

		}
	}
}
