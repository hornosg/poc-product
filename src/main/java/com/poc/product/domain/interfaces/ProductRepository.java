package com.poc.product.domain.interfaces;

import com.poc.product.application.dtos.ListProductRequest;
import com.poc.product.domain.entities.Product;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(int id);

    Page<Product> findAll(ListProductRequest request);

    Product save(Product product);

    void delete(Product product);
}
