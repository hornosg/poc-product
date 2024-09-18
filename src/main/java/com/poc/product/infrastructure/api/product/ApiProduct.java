package com.poc.product.infrastructure.api.product;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@ApiResponses({
        @ApiResponse(responseCode = "400", description = "Request has missing or invalid information"),
        @ApiResponse(responseCode = "401", description = "Invalid authentication error"),
        @ApiResponse(responseCode = "403", description = "User not authorized for using this operation"),
        @ApiResponse(responseCode = "404", description = "The resource was not found"),
        @ApiResponse(responseCode = "500", description = "Internal error at request processing time"),
        @ApiResponse(responseCode = "503", description = "Service is temporally not available")
})
@RequestMapping("/v1/product")
@Tag(name = "Productos", description = "API para gestionar productos")
public interface ApiProduct {
}
