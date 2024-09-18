package com.poc.product.infrastructure.scheduled;

import com.poc.product.application.usescase.FetchCategories;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScheduledTasks {
    private final FetchCategories fetchCategories;

    @Scheduled(cron = "0 0 */12 * * *") // Ejecutar cada 12 horas
    public void updateCategories() {
        fetchCategories.execute();
    }
}