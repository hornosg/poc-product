package com.poc.product.application.dtos;

import java.util.List;

public record ListProductsResponse(
    List<ProductResponse> products,
    int currentPage,
    int totalPages,
    long totalElements,
    int size
) {
}