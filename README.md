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
- **MySQL / H2** (depending on your DB)
- **Lombok**
- **Swagger/OpenAPI** (optional)

## 📁 Project Structure

ecommerce/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── com/akshay/ecommerce/ │ │ └── resources/ │ │ ├── application.properties │ │ └── static / templates (if any) ├── pom.xml


## 🛠️ Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/ecommerce.git
   cd ecommerce
Build the project:
./mvnw clean install

Run the application:
./mvnw spring-boot:run

Access the API:
http://localhost:8080
