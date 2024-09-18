package com.poc.product.infrastructure.repositories;

import com.poc.product.application.dtos.ListProductRequest;
import com.poc.product.domain.entities.Product;
import com.poc.product.domain.interfaces.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface H2ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product>, ProductRepository {

    @Override
    default Page<Product> findAll(ListProductRequest request) {
        Pageable pageable = PageRequest.of(request.page(), request.size());

        Specification<Product> spec = Specification.where(null);

        if (request.name() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("name"), "%" + request.name() + "%"));
        }
        if (request.price() != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("price"), request.price()));
        }
        if (request.stock() != null && request.stock() != 0) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("stock"), request.stock()));
        }
        if (request.categoryId() != null && request.categoryId() != 0) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("categoryId"), request.categoryId()));
        }

        return findAll(spec, pageable);
    }
}