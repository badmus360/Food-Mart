package com.example.foodmartapplication.dto;

import lombok.Data;

@Data
public class PasswordResetRequestDto {

    @NotBlank(message = "email should not be blank")
    private String email;

}
