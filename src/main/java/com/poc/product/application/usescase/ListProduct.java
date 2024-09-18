package com.poc.product.application.usescase;

import com.poc.product.application.dtos.ListProductRequest;
import com.poc.product.application.dtos.ListProductsResponse;
import com.poc.product.application.dtos.ProductResponse;
import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.CategoryRepository;
import com.poc.product.domain.interfaces.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListProduct {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ListProductsResponse execute(ListProductRequest request) {
        Page<Product> productPage = productRepository.findAll(request);

        List<ProductResponse> productResponses = productPage.getContent().stream()
            .map(product -> {
                return new ProductResponse(
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getStock(),
                    categoryRepository.findById(product.getCategoryId()).orElse(null)
                );
            })
            .collect(Collectors.toList());

        return new ListProductsResponse(
            productResponses,
            productPage.getNumber(),
            productPage.getTotalPages(),
            productPage.getTotalElements(),
            productPage.getSize()
        );
    }
}
