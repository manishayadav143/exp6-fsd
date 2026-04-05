package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
    Page<Product> findByPriceRange(double min, double max, Pageable pageable);
}