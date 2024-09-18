package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.UpdateProductRequest;
import com.poc.product.application.usescase.UpdateProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UpdateProductController implements UpdateProductResource {
    private final UpdateProduct updateProduct;

    @Override
    public ResponseEntity<HttpStatus> updateProduct(int id, UpdateProductRequest request) {
        updateProduct.execute(id, request);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}