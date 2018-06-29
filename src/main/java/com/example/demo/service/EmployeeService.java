package com.example.demo.service;

import com.example.demo.modal.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeBtId(Long id){
        return employeeRepository.findByEmployeeId(id);
    }

}
