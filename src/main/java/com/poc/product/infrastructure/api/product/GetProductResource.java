package com.poc.product.infrastructure.api.product;

import com.poc.product.application.dtos.ListProductsResponse;
import com.poc.product.application.dtos.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface GetProductResource extends ApiProduct {

    @Operation(summary = "Listar productos", description = "Obtiene un listado de productos con filtros opcionales y paginación")
    @ApiResponse(responseCode = "200", description = "Listado de productos obtenido exitosamente", 
                 content = @Content(schema = @Schema(implementation = ListProductsResponse.class)))
    @GetMapping
    ResponseEntity<ListProductsResponse> listProducts(
            @Parameter(description = "Filtro por nombre del producto") @RequestParam(required = false) String name,
            @Parameter(description = "Filtro por precio del producto") @RequestParam(required = false) Double price,
            @Parameter(description = "Filtro por stock del producto") @RequestParam(required = false) Integer stock,
            @Parameter(description = "Filtro por categoría del producto") @RequestParam(required = false) Integer category,
            @Parameter(description = "Número de página") @RequestParam(defaultValue = "0") int page,
            @Parameter(description = "Tamaño de página") @RequestParam(defaultValue = "10") int size);

    @Operation(summary = "Obtener un producto", description = "Obtiene un producto específico por su ID")
    @ApiResponse(responseCode = "200", description = "Producto obtenido exitosamente", 
                 content = @Content(schema = @Schema(implementation = ProductResponse.class)))
    @ApiResponse(responseCode = "404", description = "Producto no encontrado")
    @GetMapping("/{id}")
    ResponseEntity<ProductResponse> getProduct(@Parameter(description = "ID del producto") @PathVariable int id);
}
