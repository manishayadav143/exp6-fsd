http://localhost:8080/h2-console/login.do?jsessionid=9a52db1dddd24374d57cc14114ef9006
# JPA Hibernate Demo Project

## 📌 Overview

This project demonstrates how to configure JPA and Hibernate with Spring Boot using H2 database.

## ⚙️ Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Maven

## 🧱 Features

* Entity creation (Product, Category)
* One-to-Many relationship (Category → Product)
* REST API for fetching products
* Pagination and filtering using JPQL
* H2 in-memory database

## 🚀 How to Run

1. Open project in VS Code

2. Run:
   mvn clean install
   mvn spring-boot:run

3. Open browser:
   http://localhost:8080/h2-console

## 🔐 H2 Login

* JDBC URL: jdbc:h2:mem:testdb
* Username: sa
* Password: (empty)

## 🌐 API Endpoint

http://localhost:8080/products?min=0&max=50000&page=0&size=5

## 📊 Sample Queries

SELECT * FROM CATEGORY;
SELECT * FROM PRODUCT;

## 👨‍💻 Author

Gouranga
