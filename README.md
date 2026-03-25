#  Library Management System

![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-lightgrey?style=for-the-badge)

A **Spring Boot REST API** project for managing a library system. It provides full CRUD functionality for books, global exception handling, validation, and interactive API documentation using Swagger.

---

##  Features

-  Add, update, delete, and retrieve books
-  Fetch book by ID
-  Global exception handling (`@ControllerAdvice`)
-  Input validation with meaningful error messages
-  RESTful API design
-  Swagger API documentation
-  Layered architecture (Controller, Service, Repository)

---

##  Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- H2 / MySQL (based on configuration)
- Swagger / OpenAPI

---

##  Project Structure

``` text
Library-Management-System/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/library/demo/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── model/
│   │   │       ├── exception/
│   │   │       └── config/
│   │   └── resources/
│   │       ├── application.properties
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md

```
---

##  Getting Started

### 1️ Clone the Repository
```bash
git clone https://github.com/your-username/Library-Management-System.git
cd Library-Management-System
```
### 2️ Build the Project
```bash
mvn clean install
```

### 3️ Run the Application
```bash
mvn spring-boot:run
```
---
 ### API Endpoints
 Book APIs:
 
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/books | Get all books |
| GET    | /api/books/{id} | Get book by ID |
| POST   | /api/books | Add a new book |
| PUT    | /api/books/{id} | Update book |
| DELETE | /api/books/{id} | Delete book |

---
 ### Swagger Documentation

Once the application is running, access API docs:

 http://localhost:8080/swagger-ui/index.html
 
---
 ### Exception Handling

This project includes robust error handling for:

 - Resource Not Found, 
- Validation Errors,
 - Generic Server Errors

All errors return structured and meaningful JSON responses.

---
### Author:
**Arpan Adhikari**
- Washburn University
- Computer Information Science & Business Data Analytics
