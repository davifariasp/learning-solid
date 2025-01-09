# Exemplo 1

Conta bancária e seus diferentes tipos e regras.

## Violação

A classe `ContaBancaria` é uma classe concreta. Ao herdar dessa classe herda-se também a lógica de seus métodos, mas com a possibilidade de sobreescrevê-los.

Ao criar uma classe `ContaCorrente` herdando de `ContaBancaria`, não é necessário fazer alterações. Porém, ao fazer o mesmo na classe `ContaPoupanca`, é necessário alterar o método `sacar` para que ele gere uma exceção caso o saque resulte em um saldo negativo. Sendo assim, essa sobreescrita no método viola o princípio de substituição de Liskov.


## Solução

A solução dessa violação é simples, basta transformar `ContaBancaria` em uma classe abstrata com métodos abstratos. Isso permite que, uma classe ao herdar dela poderá implementar os métodos de acordo com suas necessidades.
