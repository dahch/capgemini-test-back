package com.test.employees.controllers;

import com.test.employees.models.EmployeeResponse;
import com.test.employees.models.EmployeesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    private static final String url = "http://dummy.restapiexample.com/api/v1/";

    @GetMapping("/employee")
    public EmployeesResponse getAll() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + "employees", EmployeesResponse.class);
    }

    @GetMapping("/employee/{id}")
    public EmployeeResponse getOne(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + "employee/" + id, EmployeeResponse.class);
    }
}
