# Introdução

Vamos ver aqui como o selection sort funciona e ver sua implementação em Java e é claro analisar sua performace.

## Uma Overview do Algoritmo

O selection sort começa com o elemento na primeira posição de uma matriz não classificada e examina os elementos subsequentes para encontrar o menor elemento. Uma vez encontrado, o menor elemento é trocado pelo elemento na 1ª posição.

O algoritmo então segue para o elemento na 2ª posição e varre os elementos subsequentes para encontrar o índice do 2 ° menor elemento. Uma vez encontrado, o segundo menor elemento é trocado pelo elemento da 2ª posição.

Esse processo continua até chegarmos ao n-1º elemento da matriz, que coloca o n-1º menor elemento na n-1ª posição. O último elemento cai automaticamente no lugar, na n-1ª iteração, ordenação assim a matriz.

Encontramos o maior elemento em vez do menor elemento para ordenar o array em ordem decrescente.

Vamos ver um exemplo de array não ordenado e ordena-lo em ordem crescente para entender visualmente o algoritmo.

### Exemplos:

Cosidere o seguinte array não ordenado:

```java
int[] arr = {5, 4, 1, 6, 2}

```
#### Iteração 1

Considerando o funcionamento do algoritmo acima, começamos com o elemento na 1ª posição e examinamos todos os elementos subsequentes para encontrar o menor elemento - 1. Em seguida, trocamos o menor elemento pelo elemento na 1ª posição.

O array modificado agora se parece com:

{1, 4, 5, 6, 2}

Total de comparações feitas: 4

#### Iteração 2

Na segunda iteração, passamos para o segundo elemento e examinamos os elementos subsequentes para encontrar o segundo menor elemento - 2. Em seguida, trocamos o segundo menor elemento pelo elemento da segunda posição.

O array modificada agora se parece com:

{1, 2, 5, 6, 4}

Total de comparações feitas: 3

#### Iteração 3

{1, 2, 4, 6, 5}

total de comparações feitas: 2

#### Iteração 4

{1, 2, 4, 5, 6}

Total de comparações feitas: 1

### Desempenho do algoritmo

No exemplo que vimos anteriormente, selecionar o menor elemento exigiu um total de (n-1) comparações, seguido por trocá-lo para a primeira posição. Da mesma forma, selecionar o próximo menor elemento exigiu comparações de total (n-2), seguidas pela troca na 2ª posição, e assim por diante.

Assim, a partir do índice 0, executamos n-1, n-2, n-3, n-4…. 1 comparações. O último elemento cai automaticamente no lugar devido a iterações e trocas anteriores.

Matematicamente, a soma dos primeiros n-1 números naturais nos dirá de quantas comparações precisamos para classificar uma matriz de tamanho n usando a Classificação por Seleção.

A fórmula para a soma de n números naturais é n (n + 1) / 2.

Em nosso caso, precisamos da soma dos primeiros n-1 números naturais. Portanto, substituímos n por n-1 na fórmula acima para obter:

(n-1) (n-1 + 1) / 2 = (n-1) n / 2 = (n ^ 2-n) / 2

Como n ^ 2 cresce proeminentemente conforme n cresce, consideramos a potência mais alta de n como o benchmark de desempenho, fazendo com que este algoritmo tenha uma complexidade de tempo de O (n ^ 2).

A complexidade do algoritmo é de O(1) porque o selection sort necessita de uma variável extra para segurar o valor temporário.

### Conclusão

algoritmo de Ordenação muito simples de entender e implementar. Infelizmente, sua complexidade quadrática de tempo o torna uma técnica de classificação cara. Além disso, como o algoritmo deve varrer cada elemento, o melhor caso, o caso médio e o pior caso de complexidade de tempo são os mesmos.
