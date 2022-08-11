# Operadores de Controle de Fluxo

## Controle de Fluxo de Decisão

1. If
- preferível ao switch se houver mais de uma variável
- evitar muitos ifs aninhados
- criar variáveis intermediárias para as condições para diminuir o tamanho do código dos ifs
- se só tem uma linha no bloco, não é necessário abrir chaves
- não suporta expressões aritméticas?

        if(condição){
            ...
        }

        if(condição){
            ...
        } else {
            ...
        }

        if(condição 1){
            ...;
        } else if(condição 2) {
            ...;
        } else {
            ...;
        }

3. Switch
- tipos de variável: byte, short, char, int, Enum, String
- usar switch para valores exatos e if para booleanos
- evitar usar o default para cases genéricos, usar para valores inválidos
- usar para uma única variável 

        switch(variável){
            case valor1 variável:
            case valor2 variável:
                ...;
                break;
            case valor3 variável:
                ...;
                break;
            default:
                ...;
                break;
        }
4. Operador Ternário
- deve ser evitado, devido à sintaxe dificultar a leitura quanto maior são os pedaços de código

        condição ? ação se true : ação se false;
        condição ? ação se true : null; //sem false

## Controle de Fluxo de Repetição 

1. For - repetição contada
- recomendação de uso quando precisa de um contador

        for (inicialização do iterador ; limite da repetição (operador relacional) ; incremento) {
            ...
        };

2. For each 
- para lidar com arrays elemento a elemento

        for (declaração do iterador do tipo do array : array){
            ...
        }

2. While - repetição com teste no início
- recomendação de uso quando tem uma condição booleana
       
        while(condição){
            ...
        };
3. Do while - repetição com teste no final
- usado quando precisa que entre no laço pelo menos uma vez

        do {
            ...
        } while (condição);

> :bulb: inicialização do iterador: exemplo int i = 0
> Declaração do iterador do tipo do array: int i, String s, etc.

## Controle de Fluxo de Interrupção

1. Break: usado para interromper fluxo de repetição
2. Continue: usado para interromper a repetição atual e passar para o teste da próxima repetição (é pouco utilizado)
3. Return