package com.poc.product.application.mapper;

import com.poc.product.application.dtos.ProductResponse;
import com.poc.product.domain.entities.Category;
import com.poc.product.domain.entities.Product;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-18T09:32:12-0300",
    comments = "version: 1.6.1, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProductResponseMapperImpl implements ProductResponseMapper {

    @Override
    public ProductResponse toResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        Double price = null;
        Integer stock = null;

        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        stock = product.getStock();

        Category category = null;

        ProductResponse productResponse = new ProductResponse( id, name, price, stock, category );

        return productResponse;
    }
}
