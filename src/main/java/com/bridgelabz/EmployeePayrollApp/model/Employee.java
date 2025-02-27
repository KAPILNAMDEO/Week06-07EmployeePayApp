package com.bridgelabz.EmployeePayrollApp.model;



import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee_payroll")
public @Data class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "name")
    private String name;
    private double salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    @CollectionTable(name = "employee_department",joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String>departments;

    public Employee() {}

    public Employee(Long id, EmployeeDTO employeeDTO) {
        this.id=id;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
        this.gender=employeeDTO.gender;
        this.note=employeeDTO.note;
        this.startDate=employeeDTO.startDate;
        this.profilePic=employeeDTO.profilePic;
        this.departments=employeeDTO.department;
    }

    /*
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

     */
}

