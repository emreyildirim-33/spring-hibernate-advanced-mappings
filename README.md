# Spring Hibernate Advanced Mappings

A Java and Spring Boot REST API project focused on advanced Hibernate/JPA entity relationships, layered backend architecture, DTO responses, and CRUD endpoint design.

The project simulates a simple banking domain with customers, addresses, and accounts to demonstrate relational data modeling and entity mapping in a Spring Boot application.

## Overview

This project was developed to strengthen backend persistence and relational mapping skills with Spring Boot, Hibernate, and JPA.

The main goal was to implement entity relationships, cascade behavior, DTO-style response models, CRUD endpoints, and layered backend architecture in a database-backed REST API.

The application includes customer, address, and account entities with one-to-one and one-to-many relationships.

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* REST API
* Lombok
* DTO / Record responses
* Layered backend architecture
* Relational database modeling

## Core Concepts

* Hibernate entity mapping
* JPA annotations
* One-to-One relationship
* One-to-Many relationship
* Cascade operations
* Entity lifecycle behavior
* Repository / DAO layer
* Service layer business logic
* Controller-based REST endpoints
* DTO response patterns
* Relational database design

## Domain Model

The project is based on a simple banking data model:

* `Address`
* `Customer`
* `Account`

Relationship structure:

```text
Address
   ↓ One-to-One
Customer
   ↓ One-to-Many
Account
```

## Entity Relationships

### Address - Customer

Each customer has one address.

```text
Customer 1 ─── 1 Address
```

This relationship demonstrates one-to-one mapping and cascade behavior between related entities.

### Customer - Account

A customer can have multiple accounts.

```text
Customer 1 ─── * Account
```

This relationship demonstrates one-to-many mapping and account ownership logic.

## Features

* Address CRUD operations
* Customer CRUD operations
* Account CRUD operations
* One-to-one relationship between customer and address
* One-to-many relationship between customer and account
* Account creation linked to an existing customer
* Cascade behavior handling
* DTO / response record usage
* Layered backend structure
* RESTful endpoint design

## Main API Endpoints

### Address Endpoints

| Method | Endpoint                   | Description          |
| ------ | -------------------------- | -------------------- |
| GET    | `/workintech/address`      | Get all addresses    |
| GET    | `/workintech/address/{id}` | Get address by ID    |
| POST   | `/workintech/address`      | Create a new address |
| PUT    | `/workintech/address/{id}` | Update an address    |
| DELETE | `/workintech/address/{id}` | Delete an address    |

### Customer Endpoints

| Method | Endpoint                     | Description           |
| ------ | ---------------------------- | --------------------- |
| GET    | `/workintech/customers`      | Get all customers     |
| GET    | `/workintech/customers/{id}` | Get customer by ID    |
| POST   | `/workintech/customers`      | Create a new customer |
| PUT    | `/workintech/customers/{id}` | Update a customer     |
| DELETE | `/workintech/customers/{id}` | Delete a customer     |

### Account Endpoints

| Method | Endpoint                            | Description                                        |
| ------ | ----------------------------------- | -------------------------------------------------- |
| GET    | `/workintech/accounts`              | Get all accounts                                   |
| GET    | `/workintech/accounts/{id}`         | Get account by ID                                  |
| POST   | `/workintech/accounts/{customerId}` | Create an account for a customer                   |
| PUT    | `/workintech/accounts/{customerId}` | Update an account and associate it with a customer |
| DELETE | `/workintech/accounts/{id}`         | Delete an account                                  |

## Backend Architecture

The project follows a layered backend architecture:

```text
Controller Layer
↓
Service Layer
↓
Repository / DAO Layer
↓
Entity / Database Layer
```

This structure separates request handling, business logic, persistence operations, and database modeling.

## Project Structure

```text
src/
 └── main/
     ├── java/
     │   └── ...
     │       ├── controller/
     │       ├── service/
     │       ├── dao/
     │       ├── entity/
     │       └── dto/
     └── resources/
         └── application.properties
```

## DTO / Response Models

The project uses response models such as:

* `CustomerResponse`
* `AccountResponse`

DTO-style responses help separate internal entity structures from API response data.

## What This Project Demonstrates

* Designing relational data models with JPA
* Creating entity relationships with Hibernate
* Implementing one-to-one mappings
* Implementing one-to-many mappings
* Managing cascade operations
* Building CRUD endpoints with Spring Boot
* Separating controller, service, repository, and entity layers
* Creating clean response models with DTO / record structures
* Handling customer-account relationships through API endpoints
* Structuring backend code for maintainability

## Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17+
* Maven
* A relational database
* IntelliJ IDEA or another Java IDE

### Installation

Clone the repository:

```bash
git clone https://github.com/emreyildirim-33/spring-hibernate-advanced-mappings.git
cd spring-hibernate-advanced-mappings
```

Configure your database connection in `application.properties`.

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Run the project:

```bash
./mvnw spring-boot:run
```

The application runs locally at:

```text
http://localhost:8080
```

## API Testing

You can test the endpoints using:

* Postman
* IntelliJ HTTP Client
* Browser for simple GET requests

## Notes

This project focuses on Hibernate/JPA relationship mapping, cascade behavior, DTO responses, CRUD endpoint design, and layered Spring Boot architecture.

The main purpose is to demonstrate backend persistence design, entity relationship modeling, and maintainable REST API structure rather than building a full production banking system.

## Repository

GitHub: https://github.com/emreyildirim-33/spring-hibernate-advanced-mappings
