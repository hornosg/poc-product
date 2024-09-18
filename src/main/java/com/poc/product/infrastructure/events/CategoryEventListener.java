package com.poc.product.infrastructure.events;

import com.poc.product.domain.interfaces.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryEventListener {
    private final CategoryRepository categoryRepository;

//    @RabbitListener(queues = "${rabbitmq.queue.category.create}")
//    public void handleCategoryCreatedEvent(Category category) {
//        categoryRepository.save(category);
//    }
//
//    @RabbitListener(queues = "${rabbitmq.queue.category.update}")
//    public void handleCategoryUpdatedEvent(Category category) {
//        categoryRepository.save(category);
//    }

}