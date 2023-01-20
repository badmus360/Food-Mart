package com.example.foodmartapplication.pojos;

import lombok.*;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
public class CreateCategoryResponse extends BaseResponse {
    private String categoryName;
}
