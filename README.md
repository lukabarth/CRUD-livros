# API RESTFUL

Esse projeto se trata de um CRUD de livros onde é possível adicionar, consultar, atualizar e remover um livro do banco de dados através dos endpoints.


## Stack utilizada
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)




## Como usar
1. Inicie a aplicação usando Maven
2. A API poderá ser acessada em http://localhost:8080

## API Endpoints
A API possui os seguintes endpoints:
```bash
GET /books - Lista todos os livros.

GET /books/{id} - Lista um livro específico pelo seu UUID.

POST /books - Registra um novo livro (titulo e autor não podem ser espaços em branco).

PUT /books/{id} - Atualiza um livro específico pelo seu UUID.

DELETE /books/{id} - Exclui um livro específico pelo seu UUID.
```
