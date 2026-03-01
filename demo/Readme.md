# API de Gerenciamento de Usuários (List_Person)

Esta é uma API REST desenvolvida em **Java com Spring Boot** para o gerenciamento de usuários. O projeto foi estruturado para consolidar conhecimentos em arquitetura de camadas, persistência de dados e validação de fluxos de requisições via **Postman**.

---

## 🚀 Tecnologias Utilizadas
* **Java** (Versão 17+)
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco de dados em memória para testes)
* **Maven** (Gerenciador de dependências)

---

## 🛠️ Funcionalidades (CRUD)
A API expõe os seguintes endpoints para manipulação de usuários:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/users` | Lista todos os usuários cadastrados. |
| **GET** | `/users/{id}` | Busca um usuário específico pelo ID. |
| **POST** | `/users` | Cadastra um novo usuário no sistema. |
| **PUT** | `/users/{id}` | Atualiza os dados de um usuário existente. |
| **DELETE** | `/users/{id}` | Remove um usuário do sistema. |

---

## 🧠 Desafios Técnicos e Aprendizados
Durante o desenvolvimento, o foco principal foi o **troubleshooting** de infraestrutura e integração:
* **Conectividade H2 & Security:** Resolução de conflitos de acesso ao console do banco de dados após a implementação do Spring Security.
* **Mapeamento Objeto-Relacional:** Configuração do Hibernate para garantir a persistência correta das entidades no banco em memória.
* **Workflow Profissional:** Transição do uso do navegador para o **Postman**, permitindo o envio de corpos de requisição (payloads) em formato JSON.

---

## 📁 Estrutura do Projeto
O projeto segue o padrão de camadas para garantir a separação de responsabilidades:
* **Entities:** Representação das tabelas do banco de dados.
* **Repositories:** Interface de comunicação direta com o JPA.
* **Services:** Camada de lógica de negócio e regras da aplicação.
* **Controllers:** Porta de entrada da aplicação (Exposição dos endpoints).

---

## 📈 Roadmap de Melhorias
Este projeto é um passo inicial e possui pontos de evolução mapeados para o futuro:
1. Implementação de um **Global Exception Handler** para tratamento de erros padronizado.
2. Adoção de **DTOs (Data Transfer Objects)** para otimizar a segurança e o tráfego de dados.
3. Criação de testes unitários com JUnit e Mockito.

---

## ⚙️ Como executar o projeto
1. Clone o repositório:
   ```bash
   git clone [https://github.com/ynwcaio/List_Person.git](https://github.com/ynwcaio/List_Person.git)