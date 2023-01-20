package com.example.foodmartapplication.dto;

import lombok.Data;

@Data
public class UpdateProductDto {
    @NotNull(message = "product id should not be null")
    private String productName;
    private Double price;
}
