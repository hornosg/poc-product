package com.poc.product.application.dtos;

import com.poc.product.domain.entities.Category;

public record ProductResponse(
    int id,
    String name,
    Double price,
    Integer stock,
    Category category) {
}