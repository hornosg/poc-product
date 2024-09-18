package com.poc.product.domain.interfaces;

import com.poc.product.domain.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(int id);

    List<Category> findAll();

    Category save(Category category);
}
