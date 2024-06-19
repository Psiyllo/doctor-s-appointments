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
