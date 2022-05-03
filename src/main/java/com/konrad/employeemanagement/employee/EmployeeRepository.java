package com.konrad.employeemanagement.employee;

import com.konrad.employeemanagement.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee getEmployeeByEmail(String email);

    Employee getEmployeeById(long id);
}
