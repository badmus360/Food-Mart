package com.example.foodmartapplication.pojos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CreateUserRequest implements Serializable {
    @NotBlank(message = "First name cannot be blank")
    private  String firstName;
    @NotBlank(message = "Last name cannot be blank")
    private  String lastName;
    @Email(message = "Please enter a valid email address")
    private  String email;
    @NotBlank(message = "Password cannot be blank")
    private  String password;
    @NotBlank(message = "Confirm password name cannot be blank")
    private  String confirmPassword;
}
