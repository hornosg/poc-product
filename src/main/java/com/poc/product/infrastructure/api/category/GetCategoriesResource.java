package com.poc.product.infrastructure.api.category;

import com.poc.product.domain.entities.Category;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Tag(name = "Category", description = "Category management APIs")
@RequestMapping("/v1/category")
public interface GetCategoriesResource {

    @Operation(
        summary = "List all categories",
        description = "Retrieves a list of all available categories",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved list of categories",
                content = @Content(schema = @Schema(implementation = Category.class))
            )
        }
    )
    @GetMapping
    ResponseEntity<List<Category>> listCategories();
}