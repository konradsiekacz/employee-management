package com.konrad.employeemanagement.employee;

import com.konrad.employeemanagement.employee.domain.Employee;
import com.konrad.employeemanagement.employee.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeConverter {

    public static EmployeeDTO entityToDTO(Employee employee) {
        EmployeeDTO employeeDTO = EmployeeDTO.builder().build();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        return employeeDTO;
    }

    public static List<EmployeeDTO> entitiesToDTO(List<Employee> employees) {
        return employees.stream()
                .map(EmployeeConverter::entityToDTO)
                .collect(Collectors.toList());
    }

    public static Employee DTOtoEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        return employee;
    }
}
