# Checkpoint 2 - API de Gerenciamento de Pedidos

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de pedidos, criada como parte da avaliação da disciplina de Arquitetura SOA e Web Services.

---

## Executar

```bash
git clone https://github.com/GrupoMoskitto/cp2-soa-web-services.git
cd cp2-soa-web-services
docker compose up --build
```

---

## Endpoints da API

A URL base da aplicação é `http://localhost:8085/`.

| Método | Endpoint         | Descrição                            |
|--------|------------------|--------------------------------------|
| GET    | `/health`        | Verifica o status de saúde da API.   |
| GET    | `/pedidos`       | Retorna a lista de todos os pedidos. |
| GET    | `/pedidos/{id}`  | Busca um pedido específico pelo ID.  |
| POST   | `/pedidos`       | Cria um novo pedido.                 |
| PUT    | `/pedidos/{id}`  | Atualiza os dados de um pedido.      |
| DELETE | `/pedidos/{id}`  | Deleta um pedido pelo ID.            |

> [!TIP]
> Você pode utilizar a pasta `collection/` na raiz do projeto contendo todos os testes das requisições para importar diretamente no [Bruno](https://www.usebruno.com/).

---

## Equipe

| Nome | RM | GitHub | LinkedIn |
| --- | --- | --- | --- |
| **Gabriel Couto Ribeiro** | RM559579 | [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/rouri404) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabricouto/) |
| **Gabriel Kato Peres** | RM560000 | [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/kato8088) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gabrikato/) |
| **João Vitor de Matos** | RM559246 | [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/joaomatosq) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joaomatosq/) |
| **Marcelo Affonso Fonseca** | RM559790 | [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/marcelo215) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcelo-affonso-fonseca-899682333/) |
