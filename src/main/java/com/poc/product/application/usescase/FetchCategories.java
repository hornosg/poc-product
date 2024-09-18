package com.poc.product.application.usescase;

import com.poc.product.domain.entities.Category;
import com.poc.product.domain.interfaces.CategoryGateway;
import com.poc.product.domain.interfaces.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FetchCategories {
    private final CategoryGateway categoryGateway;
    private final CategoryRepository categoryRepository;

    @Transactional
    public void execute() {
        List<Category> categories = categoryGateway.getCategories();
        categories.forEach(categoryRepository::save);
    }
}