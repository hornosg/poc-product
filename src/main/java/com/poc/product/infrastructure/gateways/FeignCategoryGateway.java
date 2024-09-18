package com.poc.product.infrastructure.gateways;

import com.poc.product.domain.entities.Category;
import com.poc.product.domain.interfaces.CategoryGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FeignCategoryGateway implements CategoryGateway {
    private final CategoryApiClient categoryApiClient;

    @Override
    public List<Category> getCategories() {
        return categoryApiClient.getCategories();
    }
}