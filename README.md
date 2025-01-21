# Foro Hub - Backend Challenge

Bienvenido al proyecto **Foro Hub**, una API REST desarrollada con Java 17 y Spring Boot. Este proyecto busca replicar la funcionalidad de un foro donde los usuarios pueden interactuar creando, leyendo, actualizando y eliminando tópicos.

## Características Principales

- **CRUD de Tópicos:**
  - Crear un nuevo tópico.
  - Mostrar todos los tópicos.
  - Mostrar un tópico específico.
  - Actualizar un tópico existente.
  - Eliminar un tópico.

- **Validación:**
  - Validación de datos según reglas de negocio.

- **Persistencia:**
  - Base de datos MySQL con configuración de Flyway Migration para gestionar tablas.

- **Autenticación y Autorización:**
  - Implementación básica de seguridad con Spring Security.

## Dependencias

El proyecto utiliza las siguientes dependencias, que se encuentran en el archivo `pom.xml`:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Flyway Migration
- MySQL Connector
- Lombok
- Spring Boot DevTools
- Validation

## Problemas Conocidos

El proyecto actualmente no compila debido a un problema relacionado con la configuración de seguridad

### Solución Pendiente

