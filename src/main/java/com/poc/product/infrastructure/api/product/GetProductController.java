package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.ListProductRequest;
import com.poc.product.application.dtos.ListProductsResponse;
import com.poc.product.application.dtos.ProductResponse;
import com.poc.product.application.usescase.GetProduct;
import com.poc.product.application.usescase.ListProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetProductController implements GetProductResource {
    private final GetProduct getProduct;
    private final ListProduct listProduct;

    @GetMapping
    public ResponseEntity<ListProductsResponse> listProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Double price,
            @RequestParam(required = false) Integer stock,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        
        ListProductRequest request = new ListProductRequest(name, price, stock, categoryId, page, size);
        ListProductsResponse response = listProduct.execute(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable int id) {
        ProductResponse response = getProduct.execute(id);
        return ResponseEntity.ok(response);
    }
}
