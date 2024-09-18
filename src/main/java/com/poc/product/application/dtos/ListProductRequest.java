package com.poc.product.application.dtos;

public record ListProductRequest(
    String name,
    Double price,
    Integer stock,
    Integer categoryId,
    int page,
    int size
) {
}