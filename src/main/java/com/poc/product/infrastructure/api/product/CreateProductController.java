package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.CreateProductRequest;
import com.poc.product.application.usescase.CreateProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateProductController implements CreateProductResource {
    private final CreateProduct createProduct;

    @Override
    public ResponseEntity<HttpStatus> createProduct(CreateProductRequest request) {
        createProduct.execute(request);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}