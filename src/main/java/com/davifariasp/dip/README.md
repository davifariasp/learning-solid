# DIP — Dependency Inversion Principle

Princípio da Inversão de Dependência — Dependa de abstrações e não de implementações.

De acordo com Uncle Bob, esse princípio pode ser definido da seguinte forma:

1. Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
- Módulos de alto nível são módulos que contêm a lógica de negócios e controle de fluxo, enquanto módulos de baixo nível são módulos que lidam com tarefas mais técnicas e operacionais, como manipulação de dados, entrada/saída (I/O), comunicação com dispositivos e interação com o sistema operacional.

2. Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.



## Injeção vs Inversão

No contexto da programação orientada a objetos, é comum que as pessoas confundam a `Inversão de Dependência` com a `Injeção de Dependência`, porém são coisas distintas, mas que relacionam entre si com um proposito em comum, deixar o código desacoplado.

> Importante: Inversão de Dependência não é igual a Injeção de Dependência, fique ciente disso! A Inversão de Dependência é um princípio (Conceito) e a Injeção de Dependência é um padrão de projeto (Design Pattern).

## Exemplos

- **[Exemplo 1](./ex1/)** - Envio de notificação de confirmação de pedido.