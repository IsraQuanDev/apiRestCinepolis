 
# apiRestCinepolis
=======
# API REST Cinepolis

Este proyecto es una API RESTful desarrollada con **Java Spring Boot** para conectar con una base de datos **Oracle**. El objetivo principal es realizar operaciones CRUD básicas para gestionar la información relacionada con las películas y sus funciones en el cine. Los endpoints están diseñados para facilitar su uso con herramientas como **Postman**.

---

## Características principales:
- **Conexión a base de datos Oracle**: Implementación mediante **JPA** y **Hibernate** para operaciones eficientes y confiables.
- **Endpoints funcionales**:
  - Listar películas.
  - Guardar nueva película.
  - Buscar película por ID.
  - Editar detalles de una película.
  - Eliminar película por ID.
  - Buscar películas por nombre.
  - Buscar películas por género.
- **Arquitectura RESTful**: Cumple con los estándares de diseño de API REST.

---

## Endpoints disponibles:
1. **Listar todas las películas**
   - URL: `http://localhost:9000/PeliculasWebService/listar`
   - Método: `GET`

2. **Guardar una nueva película**
   - URL: `http://localhost:9000/PeliculasWebService/guardar`
   - Método: `POST`
   - Payload:
     ```json
     {
       "nombre": "Nombre de la película",
       "genero": "Género",
       "director": "Director",
       "duracion": 120
     }
     ```

3. **Buscar película por ID**
   - URL: `http://localhost:9000/PeliculasWebService/buscarId`
   - Método: `POST`
   - Payload:
     ```json
     {
       "idPelicula": 1
     }
     ```

4. **Editar detalles de una película**
   - URL: `http://localhost:9000/PeliculasWebService/editar`
   - Método: `POST`
   - Payload:
     ```json
     {
       "idPelicula": 1,
       "nombre": "Nuevo nombre",
       "genero": "Nuevo género",
       "director": "Nuevo director",
       "duracion": 130
     }
     ```

5. **Eliminar película por ID**
   - URL: `http://localhost:9000/PeliculasWebService/eliminar`
   - Método: `POST`
   - Payload:
     ```json
     {
       "idPelicula": 1
     }
     ```

6. **Buscar películas por nombre**
   - URL: `http://localhost:9000/PeliculasWebService/buscarXNombre`
   - Método: `POST`
   - Payload:
     ```json
     {
       "nombre": "Película buscada"
     }
     ```

7. **Buscar películas por género**
   - URL: `http://localhost:9000/PeliculasWebService/buscarXgenero`
   - Método: `POST`
   - Payload:
     ```json
     {
       "genero": "Género deseado"
     }
     ```

---

## Tecnologías utilizadas:
- **Lenguaje**: Java 17
- **Framework**: Spring Boot
- **Base de datos**: Oracle Database
- **ORM**: JPA e Hibernate
- **Pruebas de API**: Postman

---

## Pasos de instalación:

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/apiRestCinepolis.git
>>>>>>> 857bc3ef16ab5e2d0a833da932ce7ad09022feef
