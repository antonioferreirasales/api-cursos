# API de Cursos - Desafio 01 (Formação Java Rocketseat)

API REST desenvolvida em Java com Spring Boot para o gerenciamento de cursos.

## 🛠️ Tecnologias

- **Java 17+**
- **Spring Boot 4+**
- **Spring Data JPA**
- **H2 Database / PostgreSQL**

## 📌 Tarefas

Use este checklist para ajudar a organizar a sua entrega:

- [ ] **Configuração:** Iniciar o projeto Java Spring Boot, configurar o banco de dados e criar a entidade `Curso` com todos os seus atributos (`id`, `name`, `category`, `active`, `created_at`, `updated_at`).
- [ ] **Rota `POST /cursos`:** Implementar a criação de um novo curso, recebendo `name` e `category`.
- [ ] **Rota `GET /cursos`:** Implementar a listagem de todos os cursos, incluindo a opção de filtro por `name` e `category`.
- [ ] **Rota `PUT /cursos/:id`:** Implementar a atualização do `name` e/ou `category` de um curso específico.
- [ ] **Rota `DELETE /cursos/:id`:** Implementar a remoção de um curso pelo `id`.
- [ ] **Rota `PATCH /cursos/:id/active`:** Implementar a funcionalidade de "toggle" para o status `active` do curso.

## ⭐️ Indo além

- [ ] **Tratamento de exceções:** Retornar respostas amigáveis de erro (ex: `404 Not Found` quando o ID não existir e `400 Bad Request` em falhas de validação).
- [ ] **Validação de dados:** Garantir a obrigatoriedade dos campos de entrada (`name` e `category`).

## 🏃 Como executar o projeto

```bash
# Clonar o repositório
git clone https://github.com/antonioferreirasales/api-cursos.git

# Entrar no diretório do projeto
cd api-cursos

# Executar a aplicação
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`.
