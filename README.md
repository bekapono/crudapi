# CRUD API with Spring Boot

## Project Overview
This is a **Spring Boot CRUD API** for managing users. The API allows:
- **Creating users**
- **Fetching user details**
- **Updating user information**
- **Soft deleting users** (marking them as inactive instead of permanent removal)

---

## Technologies Used
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (for testing)
- **Postman** (for API testing)
- **Git & GitHub** (version control)

---

## ⚙️ Setup & Installation

### **1. Clone the Repository**
```
git clone https://github.com/bekapono/crudapi.git
cd crudapi
```
### **2️. Configure the Database**
By default, the project uses an H2 in-memory database. If using PostgreSQL, update application.properties:
```
properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```
### **3. Run the Application**
```
mvn spring-boot:run
```
#### Once started, the API will be available at:
```
http://localhost:8080
```

### **4. Access H2 Console (For Testing)**

```
http://localhost:8080/h2-console
```
Sure! Here's the correct GitHub Markdown syntax for your H2 Database credentials, API Endpoints table, and JSON example:

markdown
Copy
Edit
## H2 Database Credentials
```
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: 
```

---

## API Endpoints

| Method  | Endpoint             | Description           |
|---------|----------------------|-----------------------|
| **POST**   | `/users`              | Create a new user |
| **GET**    | `/users`              | Get all active users |
| **GET**    | `/users/{id}`         | Get a user by ID |
| **PATCH**  | `/users/{id}/email`   | Update user's email |
| **PATCH**  | `/users/{id}/name`    | Update user's name |
| **DELETE** | `/users/{id}`         | Soft delete a user |

---

## 📌 Example `POST` Request (JSON)
```json
{
  "userName": "testuser",
  "email": "test@example.com",
  "password": "password123",
  "firstName": "John",
  "lastName": "Doe"
}
```
### To test, use Postman or curl.

