package employee.spring.jenkins.controll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import employee.spring.jenkins.controller.EmployeeController;
import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.service.EmployeeService;

public class EmployeeControllTest {

	@InjectMocks
	private EmployeeController employeeController;
	
	@Mock
	private EmployeeService employeeService;
	
	
	@Test
	private void testCreteEmployee()
	{
		Employee employee=mock(Employee.class);
		
		when(employeeService.saveDetails(Mockito.any())).thenReturn(employee);
		ResponseEntity<Employee> repoonce=employeeController.save(Mockito.any());
		assertEquals(HttpStatus.OK,repoonce.getStatusCode());
		
	}
	
}
