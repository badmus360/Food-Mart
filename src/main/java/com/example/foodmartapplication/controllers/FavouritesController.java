package com.example.foodmartapplication.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/favourites")
public class FavouritesController {
    private FavouritesService favouritesService;

    @PostMapping("/{productId}/add")
    public ResponseEntity<BaseResponse> addProductToFavourite(@PathVariable(value = "productId") Long productId) {
        BaseResponse response = favouritesService.addToFavourites(productId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
