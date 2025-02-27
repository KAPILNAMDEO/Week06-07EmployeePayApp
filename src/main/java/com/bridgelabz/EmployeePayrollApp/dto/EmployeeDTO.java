package com.bridgelabz.EmployeePayrollApp.dto;





import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
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

    @Pattern(regexp = "male|female",message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "startDate should not be Empty.")
    @PastOrPresent(message = "startdate should be past or todays date.")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    public String note;

    @NotBlank(message = "Profile pic cannot be empty.")
    public String profilePic;

    @NotNull(message = "department should not be empty")
    public List<String> department;
}

