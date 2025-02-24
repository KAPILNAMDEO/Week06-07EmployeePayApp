package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.model.Employee;
import com.bridgelabz.EmployeePayrollApp.repository.EmployeeRepository;
import com.bridgelabz.EmployeePayrollApp.validation.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getName(), employeeDTO.getSalary());
        return repository.save(employee);
    }

    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee employee = repository.findById(id).orElse(null);
        if (employee != null) {
            employee.setName(employeeDTO.getName());
            employee.setSalary(employeeDTO.getSalary());
            return repository.save(employee);
        }
        return null;
    }
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}