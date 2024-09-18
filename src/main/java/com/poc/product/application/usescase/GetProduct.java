package com.poc.product.application.usescase;

import com.poc.product.application.dtos.ProductResponse;
import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.CategoryRepository;
import com.poc.product.domain.interfaces.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProduct {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductResponse execute(int id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getPrice(),
            product.getStock(),
            categoryRepository.findById(product.getCategoryId()).orElse(null)
        );
    }
}
