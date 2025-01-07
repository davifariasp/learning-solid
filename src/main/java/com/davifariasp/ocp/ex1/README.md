# Exemplo 1

## Violação

A priori, considere o método `calcularDesconto`, na classe Desconto, que atualmente utiliza uma sequência de instruções `if-else` para verificar o tipo de desconto e aplicar o cálculo correspondente. Suponha que agora seja necessário incluir um novo tipo de desconto para promoções de Páscoa. A abordagem mais direta seria adicionar mais um bloco `if-else` para lidar com o novo cálculo. No entanto, isso viola o OCP, pois exige alterações no código original, tornando-o mais propenso a erros e menos flexível.

## Solução

Para solucionar essa violação, podemos criar uma **interface** chamada `Desconto` com um método `calcular`. Em seguida, implementamos uma **classe específica para cada tipo de desconto**, sobrescrevendo o método `calcular` conforme necessário.

Além disso, refatoramos a classe `Desconto`, renomeando-a para `CalculadoraDesconto`. Essa nova classe será responsável por calcular o desconto de forma genérica. Ela receberá um objeto do tipo `Desconto` e chamará o método `calcular`, que será definido pelas classes concretas.

### Benefícios
- **Extensibilidade**: Novos tipos de desconto podem ser adicionados sem modificar o código existente.
- **Manutenibilidade**: O código fica mais modular e fácil de compreender.
