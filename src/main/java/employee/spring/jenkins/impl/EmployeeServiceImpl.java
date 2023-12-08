package employee.spring.jenkins.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.repository.EmployeeRepository;
import employee.spring.jenkins.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	
	@Override
	public Employee saveDetails(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	@Override
	public Employee updateDetails(Employee emp) {
		// TODO Auto-generated method stub
		return repository.save(emp);
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee getById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
