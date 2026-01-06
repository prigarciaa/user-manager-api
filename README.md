# User Manager API

API REST para gerenciamento de usuários, desenvolvida com **Spring Boot** como projeto de estudo prático de backend.

O objetivo do projeto é aplicar boas práticas de desenvolvimento backend, incluindo **CRUD completo**, uso de **DTOs**, **tratamento global de exceções** e **documentação automática com Swagger (OpenAPI)**.

---

## 🚀 Tecnologias Utilizadas

* Java 17
* Spring Boot 3.4.x
* Spring Web
* Spring Data JPA
* H2 Database (em memória)
* Springdoc OpenAPI (Swagger UI)
* Maven

---

## 📂 Estrutura do Projeto

```
com.priscila.usermanager
├── controller        # Camada de entrada (REST Controllers)
├── service           # Regras de negócio
├── repository        # Acesso a dados (JPA)
├── model             # Entidades JPA
├── dto               # DTOs de Request e Response
├── exception         # Exceções customizadas e handler global
└── UsermanagerApplication.java
```

---

## 🔁 Funcionalidades

* Criar usuário
* Listar usuários
* Buscar usuário por ID
* Atualizar usuário
* Deletar usuário
* Tratamento padronizado de erros
* Documentação automática da API

---

## 📌 Endpoints

| Método | Endpoint    | Descrição                |
| ------ | ----------- | ------------------------ |
| POST   | /users      | Criar um novo usuário    |
| GET    | /users      | Listar todos os usuários |
| GET    | /users/{id} | Buscar usuário por ID    |
| PUT    | /users/{id} | Atualizar usuário        |
| DELETE | /users/{id} | Deletar usuário          |

---

## 📄 Exemplo de Request (POST /users)

```json
{
  "nome": "Priscila",
  "email": "priscila@email.com"
}
```

## 📄 Exemplo de Response

```json
{
  "id": 1,
  "nome": "Priscila",
  "email": "priscila@email.com"
}
```

---

## ⚠️ Tratamento de Erros

A API possui um **GlobalExceptionHandler** que retorna erros padronizados.

### Exemplo – Usuário não encontrado (404)

```json
{
  "status": 404,
  "message": "Usuário não encontrado",
  "timestamp": "2026-01-05T17:30:00"
}
```

---

## 📘 Swagger (OpenAPI)

Após rodar a aplicação, a documentação estará disponível em:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

* Java 17
* Maven

### Passos

```bash
# Clonar o repositório
git clone https://github.com/prigarciaa/user-manager-api.git

# Entrar na pasta do projeto
cd usermanager

# Rodar a aplicação
./mvnw spring-boot:run
```

A aplicação será iniciada em **[http://localhost:8080](http://localhost:8080)**.

---

## 🧠 Aprendizados Aplicados

* Separação de responsabilidades (Controller, Service, Repository)
* Uso de DTOs para entrada e saída de dados
* Tratamento global de exceções
* Boas práticas de API REST
* Documentação automática com Swagger

---

## 👩‍💻 Autora

**Priscila Silva Garcia**
Estudante de Análise e Desenvolvimento de Sistemas
Foco em Desenvolvimento Backend

🔗 GitHub: [https://github.com/prigarciaa](https://github.com/prigarciaa)

---

📌 Projeto desenvolvido para fins de estudo e evolução profissional.
