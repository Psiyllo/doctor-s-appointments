### Projeto Consultas Médicas

---

**Nota Inicial: Este projeto está em fase inicial e pode conter erros. Estou trabalhando para corrigi-los e garantir o funcionamento correto.**

---

### Descrição

Este é um projeto de demonstração para um sistema de consultas médicas desenvolvido em Spring Boot, utilizando Java 17 e integração com banco de dados PostgreSQL.

### Funcionalidades Principais

- **Autenticação e Autorização**: Utilização de Spring Security com JWT para autenticação de usuários.
- **CRUD de Usuários**: Operações para criar, listar, atualizar e deletar usuários (pacientes e médicos).
- **CRUD de Consultas**: Funcionalidades para gerenciar consultas médicas, incluindo criação, listagem por ID, listagem de todas e exclusão.
- **Relacionamento entre Entidades**: Uso de relacionamentos @ManyToOne e @OneToMany entre médicos, pacientes e consultas.

### Tecnologias Utilizadas

- Spring Boot 3.3.0
- Spring Security
- Spring Data JPA
- PostgreSQL
- JWT (JSON Web Token) para autenticação
- Maven como gerenciador de dependências

### Configuração do Banco de Dados

Para executar o projeto, é necessário configurar o banco de dados PostgreSQL com as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/consultasdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Como Executar

Para executar o projeto localmente:

1. Clone o repositório.
2. Configure o PostgreSQL com as propriedades especificadas.
3. Execute o projeto usando sua IDE preferida ou via linha de comando: `mvn spring-boot:run`.

## Endpoints Disponíveis

### Autenticação:

- `POST /api/auth/login`: Endpoint para autenticação de usuários.
- `POST /api/auth/register`: Endpoint para registro de novos usuários.

### Consultas:

- `POST /api/consultas`: Cria uma nova consulta.
- `GET /api/consultas/{id}`: Obtém uma consulta pelo ID.
- `GET /api/consultas`: Obtém todas as consultas.
- `DELETE /api/consultas/{id}`: Deleta uma consulta pelo ID.

### Usuários:

- `GET /api/usuarios/{id}`: Obtém um usuário pelo ID.
- `GET /api/usuarios`: Obtém todos os usuários.
- `POST /api/usuarios`: Cria um novo usuário.
- `PUT /api/usuarios/{id}`: Atualiza um usuário pelo ID.
- `DELETE /api/usuarios/{id}`: Deleta um usuário pelo ID.

## Contribuição

Sinta-se à vontade para contribuir com melhorias neste projeto. Caso encontre algum problema, por favor, abra uma issue no [repositório]([link_do_seu_repositorio](https://github.com/Psiyllo/doctor-s-appointments.git).

---

**Observação: Este readme está em desenvolvimento e pode sofrer alterações. Obrigado pela compreensão enquanto trabalhamos para melhorar o projeto.**

