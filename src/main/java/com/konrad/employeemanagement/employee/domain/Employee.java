package com.konrad.employeemanagement.employee.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
