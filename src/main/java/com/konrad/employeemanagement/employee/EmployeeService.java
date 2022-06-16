package com.konrad.employeemanagement.employee;

import com.konrad.employeemanagement.employee.domain.Employee;
import com.konrad.employeemanagement.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeDTO getEmployeeById(long id) {
        return EmployeeConverter.entityToDTO(employeeRepository.getEmployeeById(id));
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.getEmployeeByEmail(email);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(EmployeeConverter::entityToDTO)
                .collect(Collectors.toList());
    }

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(EmployeeConverter.DTOtoEntity(employeeDTO));
    }

    public void updateEmployee(Employee updateEmployee) {
        Employee employee = employeeRepository.getEmployeeById(updateEmployee.getId());
        employee.setFirstName(updateEmployee.getFirstName());
        employee.setLastName(updateEmployee.getLastName());
        employee.setEmail(updateEmployee.getEmail());
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
