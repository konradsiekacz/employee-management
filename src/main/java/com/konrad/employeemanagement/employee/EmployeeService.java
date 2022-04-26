package com.konrad.employeemanagement.employee;

import com.konrad.employeemanagement.employee.domain.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(long id){
        return employeeRepository.getById(id);
    }

    public Employee getEmployeeByEmail(String email){
        return employeeRepository.getEmployeeByEmail(email);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
