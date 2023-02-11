package com.microservice.ProductService.controller;

import com.microservice.ProductService.request.ProductRequest;
import com.microservice.ProductService.response.ProductResponse;
import com.microservice.ProductService.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    //to post and saving products to database
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProducts(@RequestBody ProductRequest productRequest){

        productService.createProduct(productRequest);
    }

    //to retrieve products to database
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){

        return productService.getAllProducts();
    }

}
