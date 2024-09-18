package com.poc.product.infrastructure.api.product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteProductResource extends ApiProduct {

    @Operation(
        summary = "Delete a product",
        description = "Deletes a product with the specified ID",
        responses = {
            @ApiResponse(
                responseCode = "204",
                description = "Product deleted successfully"
            ),
            @ApiResponse(
                responseCode = "404",
                description = "Product not found"
            )
        }
    )
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteProduct(@PathVariable int id);
}