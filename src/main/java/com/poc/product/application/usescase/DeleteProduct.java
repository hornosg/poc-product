package com.poc.product.application.usescase;

import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteProduct {

    private final ProductRepository productRepository;

    public DeleteProduct(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void execute(int id) {
        Product product = productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));

        productRepository.delete(product);
    }
}