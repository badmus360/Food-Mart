package com.example.foodmartapplication.pojos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductResponseDto extends BaseResponse {
    private ProductDto productDto;
    private ProductService productService;
}
