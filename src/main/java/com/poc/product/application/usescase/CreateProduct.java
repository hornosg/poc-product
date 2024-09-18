package com.poc.product.application.usescase;

import com.poc.product.application.dtos.CreateProductRequest;
import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProduct {
    private final ProductRepository productRepository;

    public void execute(CreateProductRequest request) {
        Product product = new Product(
                request.name(),
                request.price(),
                request.stock(),
                request.categoryId()
        );

        productRepository.save(product);
    }
}