# Income Calculator

A Java and Spring Boot project that calculates a worker's monthly income based on their base salary and hourly contracts.

## Project Evolution

This project was originally developed as a Java console application and later migrated to a Spring Boot REST API.

- **v1.0.0-console** — Initial Java console application.
- **v1.1.0-console** — Modernized Java syntax.
- **v2.0.0-web** — Spring Boot REST API version.

## Technologies

- Java 25
- Spring Boot 4.1.2
- Spring Data JPA
- Hibernate
- H2 Database
- Maven

## How to Run

### Requirements

- JDK 25
- Git

### 1. Clone the repository

```bash
git clone https://github.com/JoseFragala/Income_Calculador_By_Contract_And_Date.git
```

### 2. Navigate to the Spring Boot project

```bash
cd Income_Calculador_By_Contract_And_Date/incomeCalculator
```

### 3. Run the application

On Windows:

```bash
.\mvnw.cmd spring-boot:run
```

On Linux or macOS:

```bash
./mvnw spring-boot:run
```

## API Endpoint

Retrieve a worker's income for a specific year and month:

```http
GET /workers/{id}/income/{year}/{month}
```

Example:

```http
GET http://localhost:8080/workers/1/income/2018/8
```

The application includes sample worker and contract data initialized at startup.

## Database

The application uses an in-memory H2 database.

H2 Console:

```text
http://localhost:8080/h2-console
```

JDBC URL: `jdbc:h2:mem:testdb`

Username: `sa`

Password: empty

## Project Purpose

This project demonstrates the evolution from fundamental Java object-oriented programming concepts to REST API development with Spring Boot, JPA, and relational data persistence.
