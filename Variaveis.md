# Variáveis
## Tipos de Variáveis
- Instância: pertence a um objeto, objetos são instâncias de classe
        - exemplo de criação de objeto:

                Classe objeto = new Classe(); //Chama o construtor da classe Classe

- Classe: é uma estrutura que abstrai um conjunto de objetos com características similares e define o comportamento de seus **objetos** através de [**métodos**](https://github.com/olimaandreza/aprendendoJava/blob/ef6011062d6b9e9cdffbd3fcd407caf83e9e8ebe/Metodos.md) e os estados desses objetos através de **atributos**.
    - Boa prática começar com letra maiúscula, com nome significativo no contexto
    - Geralmente são representadas por substantivos
    - Exemplo de criação de classe:

                class NomeClasse{
                        private String variavelString; //atributo
                        private int variavelInt;
                        
                        //Construtor:
                        public NomeClasse(String variavelString,int variavelInt){
                                this.variavelString = variavelString;
                                this.variavelInt = variavelInt;
                        }

                        //getters
                        public String getVariavelString(){
                                return variavelString;
                        }
                        
                        public int getVariavelInt(){
                                return variavelInt;
                        }
                }
- Local: usada dentro de métodos
- Parâmetro: usado na atribuição do método

## Padrões para definição de variáveis
1. Visibilidade (opcional)
    - public: pode ser usada em outros trechos do código
    - protected: pode passar atributos para classes "filho" ou associação dentro do mesmo pacote
    - private: só pode ser usada dentro da classe
2. Modificador (opcional)
    - static: faz com que a variável em questão não esteja “amarrada” a um objeto. É como se, apesar de estar dentro de uma classe, na verdade não pertencesse somente ao escopo daquela classe
    - final: indica um valor que não vai ser alterado, é constante, obriga a inicialização da variável junto com sua definição
3. Tipo de Dado: sempre deve ser informado no momento de criação da variável, representa os valores e operações que as variáveis podem assumir e sofrer, exemplos:
    - char: armazena um caracter ou unicode (16 bits), usa aspas simples na definição de caracteres isolados, ex:
    
            char c='A';

    - String: trata-se de uma **classe** para conjuntos caracteres, variável de texto, usa aspas duplas na definição, ex:

            String s="Qualquer conjunto de caracteres";

    - int: números inteiros (32 bits)
    - long: números inteiros (64 bits), deve terminar com "L" para indicar explicitamente

            long l1=10000000L;

    - float: números reais (32 bits), deve ser explícito, caso contrário, será considerado como double, ex:

            float f = 3.14F;

    - double: números reais (64 bits)
    - boolean: "true" ou "false"
    - Objeto: criado a partir de uma classe
    
    :bulb: Ser de 32 ou 64 bits indica quana informação consegue ser armazenada, ou seja, 64 bits consegue armazenar mais informações (números maiores) que 32 bits
4. Nome: nome da variável que está sendo criada 
    - não pode começar com números
    - não pode ter espaços
    - "$" e "_" são permitidos, mas é boa prática evitá-los
    - é case-sensitive, ou seja, letras maiúsculas e minúsculas sõa consideradas diferentes
    - palavras reservadas não podem ser usadas como nomes de variáveis
5. Valor Inicial (opcional): valor padrão a ser considerado sempre que referenciar a variável. Mesmo que não seja atribuído pelo programador, existem valores padrões que são carregados de acordo com o tipo de dado aceito pela variável.

Exemplo:
        
        public static String nome = "Nome Padrao" ;

## Boas práticas ao lidar com variáveis
- começar com letras minúsculas
- usar nomes expressivos, de modo que seja possível entender o propósito da variável
- usar notação camelo
            
        String nomeEmpresa;
- quando for uma constante (final), usar letras maiúsculas, com separação por "_" no lugar da notação camelo, 

        final double SALARIO_MINIMO=1000.5;

- usar os tipos de dados de forma adequada para cada informação para evitar pós-processamentos desnecessários


## Casting
- Upcasting/Promover (**implícito**): transforma uma variável de um tipo mais específico para o menos específico. Ex: tipo que armazena menos informações para o que armazena mais informações
        - exemplo em classe:

                        Class ClasseB extends ClasseA {

                        }
                        ClasseA objetoA = new ClasseB(); //cria um objeto da classe mãe a partir de uma classe filha (upcast de B).
                        
- Downcasting/Regredir (deve ser **explícito**): transforma uma variável de um tipo menos específico para o mais específico. Ex: tipo que armazena mais informações para o que armazena menos informações --> pode haver perda de informação! Não é recomendável.
                - exemplo em classe:

                        Class ClasseB extends ClasseA {

                        }
                        ClasseB objetoB = (ClasseB)new ClasseA(); //cria um objeto da classe filha a partir de uma classe mãe (downcast de A).

<img src="https://github.com/olimaandreza/aprendendo-java.git/olimaandreza20x10.gif" width="800" height="400">

# Operações com Strings

- s.equalsIgnoreCase("condição") -> verifica se uma determinada string é igual ao que está na condição, sem levar em consiração maiúsculas e minúsculas
- s.compareToIgnoreCase("comparação") ->compara s com outra string de comparação sem considerar maiúsculas e minúsculas. 0 significa que não há diferença, outro número diz se é maior ou menor que a comparação
