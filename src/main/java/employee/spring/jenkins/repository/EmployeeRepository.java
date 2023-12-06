package employee.spring.jenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employee.spring.jenkins.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
