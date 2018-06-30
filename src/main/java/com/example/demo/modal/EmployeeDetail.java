package com.example.demo.modal;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee_detail")
public class EmployeeDetail implements Serializable {

    private String manager_name;
    private String project;
    private Employee employee;

    public EmployeeDetail() {
    }

    public EmployeeDetail(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDetail(String manager_name, String project) {
        this.manager_name = manager_name;
        this.project = project;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Id
    @OneToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
