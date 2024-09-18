package com.poc.product.application.dtos;

public record CreateProductRequest(
    String name,
    double price,
    Integer stock,
    Integer categoryId
) {}