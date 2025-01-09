# Exemplo 1

Envio de notificação de confirmação de pedido.

## Violação

A classe `Pedido` sempre quando for criada vai também criar uma instância de `EmailService` para enviar um email de confirmação do pedido. Isso significa que a classe `Pedido` depende diretamente da classe `EmailService`. Caso eu queira mudar a forma de envio do email, por exemplo, ao invés de mandar via e-mail mandar via sms, eu teria que alterar a classe `Pedido`, o que não é uma boa prática. E isso viola o princípio da inversão de dependência, pois a classe `Pedido` deveria depender de uma abstração, e não de uma implementação concreta.

## Solução

Para resolvermos isso, basta criar uma interface para definir um contrato que as classes devem seguir. Agora criarmos a classe `EmailService` que implementa essa interface. E na classe `Pedido` vamos indicar que ela recebe uma variável do tipo `NotificationService` e criar um construtor que recebe um objeto desse tipo. Assim, a classe `Pedido` não depende mais diretamente da classe `EmailService`, mas sim de uma abstração, que é a interface `NotificationService`.

Fazendo isso conseguimos agora ter diversos tipos de serviços de notificação, como `SmsService`, `WhatsappService`, etc. E a classe `Pedido` não precisa ser alterada para isso.