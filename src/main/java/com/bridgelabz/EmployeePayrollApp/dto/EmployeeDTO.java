package com.bridgelabz.EmployeePayrollApp.dto;





import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
//Section4 uc 1 validation added

@Data  // Generates getters, setters, equals, hashCode, and toString
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates an all-args constructor


//use of @ToString lombok annotation
public @ToString class EmployeeDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z ]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    public String name;
    @Min(value = 500,message = "Min Wage should be more than 500")

    public  double  salary;

    public String gender;

    public LocalDate startDate;

    public String note;

    public String profilePic;

    public List<String> department;
}

