package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository productRepo, CategoryRepository categoryRepo) {
        return args -> {

            Category cat1 = new Category();
            cat1.setName("Electronics");

            Category cat2 = new Category();
            cat2.setName("Clothing");

            categoryRepo.saveAll(Arrays.asList(cat1, cat2));

            Product p1 = new Product();
            p1.setName("Laptop");
            p1.setPrice(50000);
            p1.setCategory(cat1);

            Product p2 = new Product();
            p2.setName("Shirt");
            p2.setPrice(1000);
            p2.setCategory(cat2);

            productRepo.saveAll(Arrays.asList(p1, p2));
        };
    }
}