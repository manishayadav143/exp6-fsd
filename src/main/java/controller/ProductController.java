package com.example.demo.controller;

import com.example.demo.service.ProductService;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public Page<Product> getProducts(
            @RequestParam double min,
            @RequestParam double max,
            @RequestParam int page,
            @RequestParam int size) {
        return service.getProducts(min, max, page, size);
    }
}