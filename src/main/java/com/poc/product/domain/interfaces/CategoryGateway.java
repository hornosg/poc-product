package com.poc.product.domain.interfaces;

import com.poc.product.domain.entities.Category;

import java.util.List;

public interface CategoryGateway {
    List<Category> getCategories();
}