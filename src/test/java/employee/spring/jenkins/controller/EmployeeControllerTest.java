package employee.spring.jenkins.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

	@Mock
	private EmployeeService service;
	
	@InjectMocks
	private EmployeeController controller;
	
	
	@Test
	public void testCreateEmployee()
	{
		Employee employee=mock(Employee.class);
		when(service.saveDetails(employee)).thenReturn(employee);
		ResponseEntity<Employee> responce=controller.save(employee);
		assertEquals(HttpStatus.OK,responce.getStatusCode());
		
	}
}
