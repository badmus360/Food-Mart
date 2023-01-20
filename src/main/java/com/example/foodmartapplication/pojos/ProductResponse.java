package com.example.foodmartapplication.pojos;

import com.example.foodmartapplication.dto.ProductDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse extends BaseResponse {

    private List<ProductDto> products;

    public void setProductDto(List<ProductDto> productDto) {
    }
}
