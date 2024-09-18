package com.poc.product.infrastructure.repositories;

import com.poc.product.domain.entities.Category;
import com.poc.product.domain.interfaces.CategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2CategoryRepository extends JpaRepository<Category, Integer>, CategoryRepository {
}