# 🛒 E-Commerce Spring Boot Application

This is a simple E-Commerce backend application built using **Spring Boot 3.4.4** and **Java 21**. The project serves as a foundational template for developing a scalable and modular eCommerce system.

## 🚀 Features

- 🧩 Modular project structure
- 📦 RESTful API for product
- 💾 JPA for ORM
- 🔄 CRUD operations for eCommerce entities

## 🧱 Tech Stack

- **Java 21**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Maven**
- **MySQL / H2** 
- **Lombok**

## 📂 Project Structure

```
ecommerce/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── akshay/
│       │           └── ecommerce/
│       └── resources/
│           ├── application.properties
│           ├── static/
│           └── templates/
├── pom.xml
└── README.md
```


## 🛠️ Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Akshay-Jogarajiya/Ecommerce
   cd Ecommerce
2. **Build the project**:
   ```bash
   ./mvnw clean install

3. **Run the application**:
   ```bash
   ./mvnw spring-boot:run

4. **Access the API**:
   ```bash
   http://localhost:8080
