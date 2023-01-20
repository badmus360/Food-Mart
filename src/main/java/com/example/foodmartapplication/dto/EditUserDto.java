package com.example.foodmartapplication.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class EditUserDto {

    @NotBlank(message = "FirstName must not be blank!!")
    private String firstName;

    @NotBlank(message = "LastName must not be blank!!")
    private String lastName;

    @NotNull(message = "DOB must not be blank!!")
    private LocalDate dateOfBirth;

    @Email(message = "Email is required !!")
    private String email;
}
