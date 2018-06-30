package com.example.demo.modal;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private Long employee_id;
    private String name;
    private EmployeeDetail employeeDetail;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }

    public Employee(String name, EmployeeDetail employeeDetail) {
        this.name = name;
        this.employeeDetail = employeeDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    public EmployeeDetail getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }

}
