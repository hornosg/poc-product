package com.poc.product.application.mapper;

import com.poc.product.application.dtos.ProductResponse;
import com.poc.product.domain.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductResponseMapper {
    ProductResponseMapper INSTANCE = Mappers.getMapper(ProductResponseMapper.class);

    @Mapping(target = "category", ignore = true)
    ProductResponse toResponse(Product product);
}