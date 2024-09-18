package com.poc.product.application.usescase;

import com.poc.product.application.dtos.UpdateProductRequest;
import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.CategoryRepository;
import com.poc.product.domain.interfaces.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateProduct {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public void execute(int id, UpdateProductRequest request) {
        Product existingProduct = productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setName(request.name());
        existingProduct.setPrice(request.price());
        existingProduct.setStock(request.stock());

        if (request.categoryId() != 0) {
            categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        }
        existingProduct.setCategoryId(request.categoryId());

        productRepository.save(existingProduct);
    }
}