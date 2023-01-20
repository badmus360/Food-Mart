package com.example.foodmartapplication.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductService productService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add-new-product")
    public ResponseEntity<CreateProductResponse> addNewProduct (@Valid @RequestBody ProductDto productDto)  {
        CreateProductResponse productResponse = productService.addNewProduct(productDto);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }

    @PutMapping("/updateProduct/{productId}")
    ResponseEntity<UpdatedProductResponse> updateProduct(@PathVariable Long productId, @RequestBody UpdateProductDto productDto){
        UpdatedProductResponse response = productService.updateProduct(productId,productDto);
        return  new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    @GetMapping("/search")
    public ResponseEntity<PaginatedProductResponse> searchProduct(ProductSearchDto productSearchDto) {
        PaginatedProductResponse response = productService.searchProduct(productSearchDto);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<ProductResponse> fetchAllProducts() {
        return new ResponseEntity<>(productService.fetchAllProducts(),HttpStatus.ACCEPTED);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<ProductResponseDto>fetchSingleProduct(@PathVariable("productId") Long productId){
        return ResponseEntity.ok(productService.fetchSingleProduct(productId));
    }
}
