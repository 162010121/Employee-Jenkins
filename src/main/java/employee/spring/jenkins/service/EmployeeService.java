package employee.spring.jenkins.service;

import java.util.List;

import employee.spring.jenkins.entity.Employee;

public interface EmployeeService {
	
	
	Employee saveDetails(Employee employee);
	
	Employee updateDetails(Employee emp); 
	
	List<Employee> getEmployee();

}
