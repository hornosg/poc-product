package com.poc.product.application.dtos;

public record UpdateProductRequest(
    String name,
    Double price,
    int stock,
    int categoryId) {
}