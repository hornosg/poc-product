package com.poc.product.infrastructure.api.product;

import com.poc.product.application.usescase.DeleteProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteProductController implements DeleteProductResource {
    private final DeleteProduct deleteProduct;


    @Override
    public ResponseEntity<Void> deleteProduct(int id) {
        deleteProduct.execute(id);
        return ResponseEntity.noContent().build();
    }
}