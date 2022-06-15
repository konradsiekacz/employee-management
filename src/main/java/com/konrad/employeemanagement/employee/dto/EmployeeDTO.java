package com.konrad.employeemanagement.employee.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
public class EmployeeDTO {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @JsonProperty("id")
    private Long id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("email")
    private String email;
}
