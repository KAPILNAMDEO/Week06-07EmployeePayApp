package com.bridgelabz.EmployeePayrollApp.validation;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
