# Exemplo 1

## Violação

A interface `DatabaseOperations` possui métodos que não são utilizados por todas as classes que a implementam. No exemplo, a classe `Postgres` implementa todos os métodos, já a classe `Redis`, não.

## Solução

Para resolvermos esse problema, começamos refatorando a classe `DatabaseOperations` e a transformando em `CRUDOperations` e criando`DBBackup` para transferirmos o método `backup`para lá. Dessa forma, as classes que necessitam de operações de CRUD implementam a interface `CRUDOperations` e as classes que necessitam de operações de backup implementam a interface `DBBackup`.

Sendo assim, `Postgres` implementa `CRUDOperations` e `DBBackup` e `Redis` implementa apenas `CRUDOperations`.