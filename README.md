# Spring Boot MongoDB Customer Management

## 📌 Project Overview

This project demonstrates how to integrate **Spring Boot with MongoDB** using Spring Data MongoDB. It provides functionality to register customer details and retrieve all registered customers from the MongoDB database.

The application follows a layered architecture using DTO, Model, Repository, and Service layers to maintain clean and organized code.

## 🛠️ Technologies Used

- Java 25
- Spring Boot 4.2.0
- Spring Data MongoDB
- MongoDB
- Maven
- IntelliJ IDEA

## ✨ Features

- Customer registration using CustomerDTO.
- Store customer information in MongoDB.
- Retrieve all customer records.
- Automatic ID generation using MongoDB.
- Data transfer between DTO and Entity using Spring BeanUtils.
- Repository-based database operations using MongoRepository.
- Layered architecture for better code organization.

## 📂 Project Structure

```text
SpringBoot-MongoDB-Customer-Management
│
├── src/main/java
│   └── com/naresh/SpringMongoDB
│       │
│       ├── dto
│       │   └── CustomerDTO.java
│       │
│       ├── model
│       │   └── Customer.java
│       │
│       ├── repo
│       │   └── ICustomerRepo.java
│       │
│       ├── service
│       │   ├── ICustomerService.java
│       │   └── CustomerService.java
│       │
│       └── SpringMongoDbApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ MongoDB Configuration

Configure the following properties in `application.properties`:

```properties
spring.application.name=SpringMongoDB

spring.mongodb.database=finishers
spring.mongodb.port=27017
spring.mongodb.host=localhost
```

**Database Details:**

- Database Name: `finishers`
- Collection Name: `customer`
- MongoDB Default Port: `27017`

Make sure MongoDB Server is running before starting the application.

## 🧩 Application Architecture

### 1. Model Layer
- `Customer.java`
- Represents customer data stored in MongoDB.
- Uses `@Document` and `@Id` annotations.

### 2. DTO Layer
- `CustomerDTO.java`
- Transfers customer information between application layers.
- Separates incoming customer data from the database entity.

### 3. Repository Layer
- `ICustomerRepo.java`
- Extends `MongoRepository<Customer, String>`.
- Provides built-in database operations.

### 4. Service Layer
- `ICustomerService.java`
- Defines customer registration and retrieval operations.
- `CustomerService.java` implements the business logic.
- Uses `BeanUtils.copyProperties()` to copy DTO properties into the Customer entity.

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/nareshyelamoni/SpringBoot-MongoDB-Customer-Management.git
```

2. Open the project in IntelliJ IDEA.

3. Make sure Java 25 and MongoDB Server are installed.

4. Start your MongoDB Server.

5. Update MongoDB configuration in `application.properties` if required.

6. Run the main application class:

`SpringMongoDbApplication.java`

## 🧪 Sample Customer Data

The application registers the following customer:

```java
CustomerDTO dto =
    new CustomerDTO(2, "Prasad", "Hyderabad");
```

**Expected Console Output:**

```text
Customer info stored with id <generated-id>

Customer [id=<generated-id>,
custoNo=2,
name=Prasad,
city=Hyderabad]
```

The generated ID is assigned by MongoDB.

## 📚 Concepts Practiced

- Spring Boot Application Development
- Spring Data MongoDB Integration
- MongoRepository
- MongoDB Document Mapping
- DTO Pattern
- Dependency Injection
- Service Layer Implementation
- CRUD Operations (Create and Read)

## 👨‍💻 Author

**Naresh Yelamoni**

GitHub: https://github.com/nareshyelamoni

---

⭐ If you find this project useful, feel free to explore the repository and provide feedback.