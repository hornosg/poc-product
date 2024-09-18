package com.poc.product.infrastructure.api.category;

import com.poc.product.application.usescase.ListCategories;
import com.poc.product.domain.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetCategoriesController implements GetCategoriesResource {
    private final ListCategories listCategories;

    @Override
    public ResponseEntity<List<Category>> listCategories() {
        return ResponseEntity.ok(listCategories.execute());
    }
}