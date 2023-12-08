package employee.spring.jenkins.ImplTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.impl.EmployeeServiceImpl;
import employee.spring.jenkins.repository.EmployeeRepository;
import employee.spring.jenkins.service.EmployeeService;



public class EmployeeServiceImplTest {
	
	@Mock
	private EmployeeRepository repository;
	
	private EmployeeServiceImpl service;
	
	AutoCloseable closeable;
	
	Employee employee;
	
	
	@BeforeEach
	void setUp()
	{
		closeable=MockitoAnnotations.openMocks(this);
		employee=new Employee();
	}
	
	@Test
	void testCreateEmployee() throws Exception
	{
		mock(Employee.class);
		mock(EmployeeRepository.class);
		
		when(repository.save(employee)).thenReturn(employee);
		assertThat(service.saveDetails(employee));
		
	}

}
