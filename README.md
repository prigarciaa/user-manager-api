# User Manager API

API REST desenvolvida em Java com Spring Boot para gerenciamento de usuários.
Projeto criado com foco em boas práticas de arquitetura, separação de camadas e desenvolvimento backend.


---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Maven
- Postman (para testes da API)

---

## 📁 Estrutura do projeto

```text
src/main/java/com/priscila/usermanager
├── controller   # Camada de entrada (HTTP)
├── service      # Regras de negócio
├── repository   # Acesso a dados (JPA)
├── model        # Entidades
└── UsermanagerApplication.java
