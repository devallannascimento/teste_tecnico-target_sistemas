###3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA? <strong><code>77</code></strong>

###4) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, <strong><code>9</code></strong> // Sequência de números ímpares

b) 2, 4, 8, 16, 32, 64, <strong><code>128</code></strong> // Cada elemento é o dobro do anterior

c) 0, 1, 4, 9, 16, 25, 36, <strong><code>49</code></strong> // Sequência dos quadrados perfeitos

d) 4, 16, 36, 64, <strong><code>100</code></strong> // Sequência dos quadrados dos números pares

e) 1, 1, 2, 3, 5, 8, <strong><code>13</code></strong> // Sequência de Fibonacci

f) 2,10, 12, 16, 17, 18, 19, <strong><code>200</code></strong> // Sequência de através de todos os números que iniciam com a letra d

###5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 
```
##Na minha primeira ida:

- Ligo o interruptor  1 por cerca de 5 minutos e o desligo, em seguida ligo interruptor 2 e verifico a lâmpada uma das salas.

1. Se a lâmpada estiver acessa, pertence ao interruptor 2.
2. Se estiver desligada e quente pertence ao interruptor 1.
3. Se estiver desligada e fria pertence ao interruptor 3.

##Na minha segunda ida:

- Sabendo já a qual pertence um interruptor, apenas deixo um ligado e outro desligado entre o restantes
- Vou até outra sala e verifico se lâmpada esta ligada ou não.

```
