package com.example.foodmartapplication.dto;

import lombok.Data;

@Data
public class ProductDto {

    @NotNull (message = "Name must not be null")
    private Category category;
    @NotBlank(message = "Name must not be null")
    private String productName;
    @NotNull (message = "Price must not be null")
    private double productPrice;
    @NotBlank (message = "Image must not be null")
    private String imageUrl;
    @NotNull (message = "Quantity must not be null")
    private Long quantity;

}
