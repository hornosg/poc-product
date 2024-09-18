package com.poc.product.infrastructure.gateways;

import com.poc.product.domain.entities.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "categoryApi", url = "https://api.develop.bricks.com.ar")
public interface CategoryApiClient {
    @GetMapping("/business/category")
    List<Category> getCategories();
}