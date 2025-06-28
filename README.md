# 🔐 Gerador de Senhas Seguras

Este projeto é uma API REST desenvolvida com **Spring Boot 3** que gera senhas seguras de forma simples e personalizável. Ideal para sistemas que exigem autenticação segura ou cadastro de novos usuários com senhas fortes.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.3
- Spring Web
- Spring Validation
- Swagger OpenAPI (SpringDoc 2.5.0)
- Jakarta Servlet
- Maven

---

## 📦 Como rodar o projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/gerador-senhas.git
   cd gerador-senhas
   ```

2. **Compile o projeto:**

   ```bash
   ./mvnw clean package
   ```

3. **Execute a aplicação:**

   ```bash
   ./mvnw spring-boot:run
   ```

4. A API estará disponível em:

   ```
   http://localhost:8080
   ```

---

## 📚 Documentação Swagger

Você pode acessar a interface interativa do Swagger UI aqui:

```
http://localhost:8080/swagger-ui.html
```

Ou diretamente:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🔄 Endpoint Principal

### `GET /gerar-senha`

Gera uma nova senha segura com o comprimento informado (padrão: 12).

#### Parâmetros:

| Nome   | Tipo | Obrigatório | Descrição               |
| ------ | ---- | ----------- | ----------------------- |
| length | int  | Não         | Tamanho da senha gerada |

#### Exemplo de requisição:

```
GET http://localhost:8080/gerar-senha?length=16
```

#### Exemplo de resposta:

```json
{
  "password": "aA!4mP@9zX2eLq7f"
}
```

---

## 📁 Estrutura do Projeto

```
projeto.geradorsenhas
├── adapter.in.controller         # Controllers da API
├── application.dto               # DTOs usados nas respostas
├── infrastructure.config         # Configurações do projeto (Swagger)
├── service                       # Lógica de geração de senha
└── GeradorSenhasApplication      # Classe principal da aplicação
```

---

## ✨ Contribuições

Sinta-se à vontade para abrir issues, enviar PRs ou sugerir melhorias!

---

## 📝 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

