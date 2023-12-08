package employee.spring.jenkins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee> save(@RequestBody Employee employee)
	{
		Employee entity=service.saveDetails(employee);
		System.out.println(entity); System.out.println("Entity");
		return new ResponseEntity<>(entity,HttpStatus.OK);
		
	}
	
	@PostMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee employee)
	{
		Employee entity=service.saveDetails(employee);
		return new ResponseEntity<>(entity,HttpStatus.OK);
		
	}
	@GetMapping("getAll")
	public ResponseEntity<List<Employee>> getEmployee()
	{
		List<Employee> list=service.getEmployee();
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	
}
