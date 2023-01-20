package com.example.foodmartapplication.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService cartService;

    @DeleteMapping("/remove-cart-item/{cart-item-id}")
    public ResponseEntity<BaseResponse> removeCartItem(@PathVariable("cart-item-id") long cartItemId) {
        BaseResponse response = cartService.removeCartItem(cartItemId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}