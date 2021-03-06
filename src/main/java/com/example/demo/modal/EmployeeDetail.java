package com.example.demo.modal;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee_detail")
public class EmployeeDetail implements Serializable {

    @Column(name = "manager_name")
    private String manager_name;

    @Column(name = "project")
    private String project;

    @Id
    @OneToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;


    public EmployeeDetail() {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
