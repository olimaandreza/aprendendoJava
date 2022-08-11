# Array
- é um **objeto** utilizado para armazenar sequencialmente vários dados **do mesmo tipo**
- após criado, permanece com o mesmo tamanho
- a ordem em que os elementos são inseridos se mantém no array
- é o que está por trás de coleções, especialmente a coleção *list*
- para criar array é necessário declarar o tipo de variável que ele vai conter, abre e fecha colchetes para indicar que é um array

        //cria um array uni dimensional do tipo String de tamanho 6:
        String[] nomeDoArray = new String[6];

        // cria um array uni dimensional do tipo inteiro com dois elementos:
        int[] nomeDoArray = {elemento1, elemento2}; // esse modo é mais usual
        int nomeDoArray[] = {elemento1, elemento2};

        // atribui um elemento a uma posição existente no array:
        vetor[posição]=valorElemento;

- quando tem duas dimensão, pode tratar cada linha como um array uni dimensional

        // cria um array bidimensional
        int[][] bidimensional // o primeiro colchetes refere-se a linha e o segundo a coluna

- indexação de array começa no zero

        c[i][j]
        # acessa linha i coluna j do array c

## Operações com arrays

- array.length -> mostra o tamanho, quando tem duas dimensões, mostra o número de linhas