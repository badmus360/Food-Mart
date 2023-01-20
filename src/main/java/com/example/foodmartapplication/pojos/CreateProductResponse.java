package com.example.foodmartapplication.pojos;

import lombok.*;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
public class CreateProductResponse extends BaseResponse {
    private String productName;
}
