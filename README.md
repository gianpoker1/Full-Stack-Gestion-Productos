 # Proyecto Full Stack de Sistema de Inventarios

Este repositorio contiene un proyecto full stack para la gestión de inventarios. El backend está desarrollado en Java con Spring Boot y utiliza MySQL como base de datos. El frontend está desarrollado en JavaScript con Angular.

## Características

- **Backend**:
  - Desarrollado en Java con Spring Boot.
  - Base de datos MySQL.
  - CRUD completo para la gestión de productos.
  - Manejo de excepciones personalizadas.

- **Frontend**:
  - Desarrollado en JavaScript con Angular.
  - Interfaz de usuario amigable para la gestión de productos.
  - Integración con el backend mediante servicios HTTP.
  - Uso de Bootstrap para el diseño de la interfaz.

## Tecnologías Utilizadas

- **Backend**:
  - Java
  - Spring Boot
  - MySQL
 
- **Frontend**:
  - Angular
  - TypeScript
  - Bootstrap
 
## Instrucciones de Instalación y Uso

Para clonar y ejecutar este proyecto, sigue estos pasos:

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/gianpoker1/Full-Stack-Gestion-Productos
   cd sistema-inventarios

2. **Configurar el Backend**

   Configura la base de datos MySQL en el archivo `application.properties`.
   Ejecuta el backend

3. **Configurar el Frontend**

   - Instala las dependencias:
     
     ```
     cd frontend
     npm install
4. **Ejecuta el frontend:**

  - `ng serve`
  - Abre tu navegador y ve a `http://localhost:4200` para acceder a la interfaz de usuario.
  
## Estructura del Proyecto

  ### Backend:
  - **`src/main/java/gian/inventarios/controllers`:** Controladores REST.
  - **`src/main/java/gian/inventarios/model`:** Modelos de datos.
  - **`src/main/java/gian/inventarios/service`:** Servicios de negocio.
  - **`src/main/java/gian/inventarios/repository`:** Repositorios de acceso a datos.
### Frontend:
  - **`src/app`:** Servicios HTTP para comunicarse con el backend y componentes de Angular para la interfaz de usuario.
  
  
