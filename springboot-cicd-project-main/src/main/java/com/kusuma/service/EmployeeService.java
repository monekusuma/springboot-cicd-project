package com.kusuma.service;

import com.kusuma.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(1, "Kusuma", "SRE"),
                new Employee(2, "Rahul", "DevOps"),
                new Employee(3, "Kiran", "Cloud Engineer"),
                new Employee(4, "Priya", "Platform Engineer")
        );
    }
}
