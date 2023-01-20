package com.example.foodmartapplication.dto;

import lombok.Data;

@Data
public class PasswordResetDto {

    private String token;

    private String password;
}
