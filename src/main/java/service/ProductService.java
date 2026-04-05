package com.example.demo.service;

import com.example.demo.repository.ProductRepository;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Page<Product> getProducts(double min, double max, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("price").ascending());
        return repo.findByPriceRange(min, max, pageable);
    }
}