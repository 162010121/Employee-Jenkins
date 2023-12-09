package employee.spring.jenkins.ImplTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import employee.spring.jenkins.entity.Employee;
import employee.spring.jenkins.impl.EmployeeServiceImpl;
import employee.spring.jenkins.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceImplTest {

	@Mock
	private EmployeeRepository repository;

	@InjectMocks
	private EmployeeServiceImpl service;

	AutoCloseable closeable;

	Employee employee;

	@BeforeEach
	void setUp() {
		closeable = MockitoAnnotations.openMocks(service);
		employee = new Employee();
	}
	@Test
	void testCreateEmployee() throws Exception {
		Employee employee = mock(Employee.class);
		mock(EmployeeRepository.class);

		when(repository.save(employee)).thenReturn(employee);
		assertThat(service.saveDetails(employee));

	}
	
	@Test
	public void testCreateEmployeeException()
	{
		Employee employee = mock(Employee.class);
		mock(EmployeeRepository.class);
		
		employee.setId(1L);
		employee.setName("Praveen");
		employee.setNumber(90598);
		employee.setDepartment("Java Developer");
		employee.setAddress("Kurnool");
		
		when(repository.save(Mockito.any())).thenReturn(employee);
		Employee emp=service.saveDetails(employee);
		assertEquals(employee, emp);
	}



}
