package com.example.foodmartapplication.dto;

import lombok.Data;

@Data
public class AdminPasswordResetDto {
    private String token;
    private String password;
}

