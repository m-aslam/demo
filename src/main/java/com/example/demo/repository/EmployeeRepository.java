package com.example.demo.repository;

import com.example.demo.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

//    Employee findEmployeeByEmployee_id(Long employee_id);
}
