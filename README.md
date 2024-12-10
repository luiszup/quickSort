# QuickSort em Java

## Descrição

Este programa implementa o algoritmo de ordenação **QuickSort** em Java. Ele recebe um array de inteiros, 
exibe os valores desordenados, ordena o array utilizando o QuickSort e, em seguida, exibe os valores ordenados.

O **QuickSort** é um dos algoritmos de ordenação mais eficientes, com complexidade média de tempo 
\(O(n \log n)\), sendo amplamente utilizado devido à sua eficiência e simplicidade. No entanto, 
o desempenho do algoritmo pode ser degradado em casos de arrays já ordenados ou quase ordenados. 
Para mitigar isso, estratégias como a escolha aleatória do pivô podem ser utilizadas. 
Este programa, para simplificar, utiliza um pivô fixo (o elemento do meio do array).

---

## Explicação do funcionamento

O programa utiliza o algoritmo **QuickSort**, que funciona com base no conceito de **divisão e conquista**.
A lógica do programa é a seguinte:

### Partição:
- O array é dividido em duas partes com base em um elemento chamado **pivô**.
- O pivô é escolhido como o elemento central do array.
- Todos os elementos menores que o pivô são movidos para a esquerda, e os maiores para a direita.

### Recursão:
- O **QuickSort** é chamado recursivamente para ordenar as duas subpartes (à esquerda e à direita do pivô).

### Finalização:
- O processo continua até que todas as subpartes estejam ordenadas, resultando em um array completamente ordenado.

---
## Estrutura do programa

### Método `quicksort`:
- Realiza a ordenação recursiva do array.
- Divide o array em subpartes com base no índice de partição retornado pelo método `particao`.

### Método `particao`:
- Realiza a partição do array em torno de um pivô.
- Utiliza dois ponteiros (`i` e `j`) para percorrer o vetor e mover elementos menores e maiores que o pivô
  para os lados corretos.

---
