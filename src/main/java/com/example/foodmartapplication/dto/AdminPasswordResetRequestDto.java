package com.example.foodmartapplication.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminPasswordResetRequestDto {
    @NotBlank(message = "Please enter an email")
    private String email;
}
