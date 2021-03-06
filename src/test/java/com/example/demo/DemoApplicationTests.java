package com.example.demo;

import com.example.demo.modal.Employee;
import com.example.demo.modal.EmployeeDetail;
import com.example.demo.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//    @Test
//    public void contextLoads() {
//    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmployee(){
        Employee employee = new Employee();
        employee.setName("Aslam");

        EmployeeDetail employeeDetail = new EmployeeDetail();
        employeeDetail.setManager_name("Zeeshan");
        employeeDetail.setProject("PNT");

        employee.setEmployeeDetail(employeeDetail);

        employeeRepository.save(employee);
    }

}
