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
