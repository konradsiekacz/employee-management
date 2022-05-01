package com.konrad.employeemanagement.employee.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
