# Bricks Products API

Este proyecto es una API para gestionar productos y sus categorías utilizando Spring Boot y H2.

## Requisitos previos

- Java 17
- Gradle

## Configuración del proyecto

1. Clona este repositorio:
   ```
   git clone https://github.com/hornosg/poc-product.git
   cd poc-products
   ```

2. Compila el proyecto:
   ```
   ./gradlew build
   ```

## Ejecución del proyecto

1. Ejecuta la aplicación:
   ```
   ./gradlew bootRun
   ```

2. La aplicación estará disponible en `http://localhost:8080`

## Pruebas con Swagger

1. Abre tu navegador y ve a `http://localhost:8080/swagger-ui.html`

2. Verás la interfaz de Swagger con todos los endpoints disponibles.

3. Puedes probar los siguientes endpoints:
   - GET /v1/product: Lista todos los productos
   - GET /v1/product/{id}: Obtiene un producto por su ID
   - POST /v1/product: Crea un nuevo producto
   - PUT /v1/product/{id}: Actualiza un producto existente
   - DELETE /v1/product/{id}: Elimina un producto
   - GET /v1/category: Listado de categorías

4. Para probar los endpoints, haz clic en el endpoint deseado, luego en "Try it out", completa los parámetros necesarios y haz clic en "Execute".

## Base de datos

El proyecto utiliza H2 como base de datos en memoria. La base de datos se inicializa automáticamente cuando se ejecuta la aplicación.

### Acceder a la Consola de H2 (Opcional)

Para acceder a la interfaz web de H2 y explorar la base de datos:

1. Navega a `http://localhost:8080/h2-console` (o el puerto que estés utilizando).
2. Utiliza la siguiente configuración para conectarte:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: (deja en blanco)
3. Haz clic en "Connect" para acceder a la consola de H2.

## Notas adicionales

- La base de datos se inicializa con algunos datos de ejemplo al arrancar la aplicación.
- Asegúrate de que el puerto 8080 esté disponible en tu sistema antes de ejecutar la aplicación.