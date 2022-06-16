package com.konrad.employeemanagement.employee;
import com.konrad.employeemanagement.employee.domain.Employee;
import com.konrad.employeemanagement.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    @GetMapping("")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDTO getAllEmployees(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
    }

    @PutMapping()
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id")Long id){
        employeeService.deleteEmployee(id);
    }
}
