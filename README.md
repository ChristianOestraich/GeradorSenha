# 🔐 Secure Password Generator

This project is a REST API developed with **Spring Boot 3** that generates secure, customizable passwords in a simple way. Ideal for systems that require strong authentication or user registration with robust passwords.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot 3.5.3
- Spring Web
- Spring Validation
- Swagger OpenAPI (SpringDoc 2.5.0)
- Jakarta Servlet
- Maven

---

## 📦 How to Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/gerador-senhas.git
   cd gerador-senhas
   ```

2. **Build the project:**

   ```bash
   ./mvnw clean package
   ```

3. **Run the application:**

   ```bash
   ./mvnw spring-boot:run
   ```

4. The API will be available at:

   ```
   http://localhost:8080
   ```

---

## 📚 Swagger Documentation

You can access the interactive Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

Or directly:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🔄 Main Endpoint

### `GET /gerar-senha`

Generates a new secure password with the specified length (default: 12).

#### Parameters:

| Name   | Type | Required | Description             |
| ------ | ---- | -------- | ----------------------- |
| length | int  | No       | Desired password length |

#### Request Example:

```
GET http://localhost:8080/gerar-senha?length=16
```

#### Response Example:

```json
{
  "password": "aA!4mP@9zX2eLq7f"
}
```

---

## 📁 Project Structure

```
projeto.geradorsenhas
├── adapter.in.controller         # API Controllers
├── application.dto               # DTOs used in responses
├── infrastructure.config         # Project configuration (Swagger)
├── service                       # Password generation logic
└── GeradorSenhasApplication      # Main application class
```

---

## ✨ Contributions

Feel free to open issues, submit pull requests, or suggest improvements!

---

## 📝 License

This project is licensed under the [MIT License](LICENSE).
