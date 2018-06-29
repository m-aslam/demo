package com.example.demo.modal;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private EmployeeDetail employeeDetail;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, EmployeeDetail employeeDetail) {
        this.name = name;
        this.employeeDetail = employeeDetail;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDetail getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }

}
