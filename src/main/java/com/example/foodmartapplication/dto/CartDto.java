package com.example.foodmartapplication.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CartDto {
    private Long cartId;
    private int quantity;
    private double cartTotal;
    private List<CartItemDto> cartItemList;
}
