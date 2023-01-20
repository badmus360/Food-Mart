package com.example.foodmartapplication.pojos;

import com.example.foodmartapplication.model.Product;
import lombok.*;

import java.util.List;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
public class PaginatedProductResponse extends BaseResponse {
    private List<Product> productList;
    private Long numberOfProducts;
    private int numberOfPages;
}
