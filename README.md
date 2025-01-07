# Basic Api - Spring Boot

Este proyecto es una API simple desarrollada con Spring Boot como parte de una tarea del bootcamp de MindHub. 
Su objetivo principal fue familiarizarse con la creación de endpoints básicos utilizando los métodos GET y POST.

## Endpoints Implementados

La API cuenta con cuatro endpoints principales:

- Obtener un saludo
    - GET /api/greeting
- Enviar datos
    - POST /api/submit
- Obtener usuario por ID
    - GET /api/user/{id}
- Busqueda
    - GET /api/search?query=Spring

## Documentación OpenAPI

El proyecto incluye documentación con OpenAPI para describir los endpoints de manera más formal 
y estructurada. Para visualizarla:

1. Ejecuta la aplicación Spring Boot.
2. Accede a http://localhost:8080/swagger-ui/index.html para ver la interfaz de Swagger.

## Descargar JSON de Postman

Para facilitar la prueba de los endpoints, se incluye un archivo JSON con las solicitudes configuradas para Postman.

Ubicacion: ./Spring Simple API.postman_collection.json