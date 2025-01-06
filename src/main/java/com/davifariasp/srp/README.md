# SRP — Single Responsibility Principle

Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar. Isso significa que ela deve ter uma única razão para ser alterada devido a uma mudança em sua responsabilidade, estando focada em uma única responsabilidade.

## Violção

Um exemplo clássico de violação ocorre quando uma classe única acumula múltiplas responsabilidades.

Aqui, a classe `User` está desempenhando três responsabilidades diferentes:
- Gerenciar a criação de um objeto `User`.
- Realizar operações relacionadas ao banco de dados.
- Enviar notificações por e-mail.

Isso viola o princípio, pois qualquer mudança em um desses aspectos pode impactar diretamente os outros.

## Solução

Para resolver essa violação, devemos separar as responsabilidades em classes distintas, cada uma lidando com uma única tarefa. Sendo assim criando duas novas classes:

- **UserRepository**: Classe para lidar com manipulações no banco de dados
- **EmailService**: Classe para lidar com envio de e-mails

### Benefícios
- **Isolação de responsabilidades**: Cada classe tem um objetivo claro e único.
- **Facilidade de manutenção**: Mudanças em uma funcionalidade não impactam outras responsabilidades.
- **Reutilização**: Classes especializadas podem ser reutilizadas em diferentes partes do sistema.

É importante ressaltar que o princípio não significa que cada classe deve ter apenas um método, mas que ela deve ter apenas uma responsabilidade bem definida.

