package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.UpdateProductRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateProductResource extends ApiProduct{

    @Operation(
        summary = "Update an existing product",
        description = "Updates an existing product with the provided details",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Product updated successfully"
            ),
            @ApiResponse(
                responseCode = "400",
                description = "Invalid input"
            ),
            @ApiResponse(
                responseCode = "404",
                description = "Product not found"
            )
        }
    )
    @PutMapping("/{id}")
    ResponseEntity<HttpStatus> updateProduct(@PathVariable int id, @RequestBody UpdateProductRequest request);
}