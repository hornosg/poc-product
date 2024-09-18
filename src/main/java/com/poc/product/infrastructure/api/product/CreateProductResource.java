package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.CreateProductRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CreateProductResource extends ApiProduct {

    @Operation(
        summary = "Create a new product",
        description = "Creates a new product with the provided details",
        responses = {
            @ApiResponse(
                responseCode = "201",
                description = "Product created successfully"
            ),
            @ApiResponse(
                responseCode = "400",
                description = "Invalid input"
            )
        }
    )
    @PostMapping
    ResponseEntity<HttpStatus> createProduct(@RequestBody CreateProductRequest request);
}