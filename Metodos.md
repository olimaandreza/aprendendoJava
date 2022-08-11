# Métodos

## Definição
> É uma porção de código (sub-rotina) que é disponibilizada por uma **classe** para definir um comportamento sobre a classe, quando requisitado

:bulb: todo método deve ser criado dentro de uma classe.

## Padrões para definição de um método
1. Visibilidade (opcional)
    - public: pode ser usada em outros trechos do código
    - protected: pode passar atributos para classes "filho" ou associação dentro do mesmo pacote
    - private: só pode ser usada dentro da classe
1. Tipo 
    - concreto
    - abstract: criado em classe mão, classes filhas vão ser obrigadas a criar lógica deste método, não pode ser instanciado
1. Modificador
    - static: permite chamar um método a partir de uma classe
    - final
1. Retorno (obrigatório): é uma instrução de interrupção
    - tipo de **Variável**
    - void: executa mas não tem retorno (pode ter print)

        O método lança seu retorno (finaliza a execução) quando o primeiro caso acontecer:
        
        - completa todas as instruções internas
        - chega a uma declaração explícita de retorno
        - lança uma exceção
1. Nome (obrigatório): nome do método que está sendo criado
    - não pode começar com números
    - não pode ter espaços
    - "$" e "_" são permitidos, mas é boa prática evitá-los
    - é case-sensitive, ou seja, letras maiúsculas e minúsculas sõa consideradas diferentes
    - palavras reservadas não podem ser usadas como nomes de variáveis
1. Parâmetros: são inputs para o método, quando utilizados, devem ser indicados dentro de parênteses após a definição do nome do método com o tipo indicado
    - parâmetros podem ser a chamada de outro método
1. Exceções: são erros que o método pode disparar caso ocorra algo inesperado
1. Corpo (obrigatório): código que define o comportamento ou vazio (sem as chaves)

Exemplo:
    
    public abstract double calculaSalario(int parametro1,double parametro2){
        ...
        corpo
        ...
    }; 

## Utilização de um método

Pode ser por meio de uma classe ou de um objeto:

    nomeDaClasse.metodo(parametros);
    nomeDoObjeto.metodo(parametros);

## Conceitos inerentes aos métodos
- Assinatura: é a forma de identificar unicamente um método, composto por nome do método + parâmetros

    Exemplo: calculaSalario(int parametro1,double parametro2)

- Construtor: é uma função (método) com o mesmo nome da classe que cria **objetos**
- Destrutor: é um método que destrói **objetos**
- Mensagem: é o ato de chamar um método para que ele seja executado (conforme seção anterior)
- Passar parâmetros
    - Por valor (cópia): o que é feito com o parâmetro dentro do método não altera fora, é utilizada uma cópia dentro do método

        Exemplo:
    
            int i=10;
            public void nomeDoMetodo(int i){
                i+=10;
                System.out.println("Valor do i dentro do método:" + i) // vai ser igual a 20
            }
            System.out.println("Valor do i fora do método:" + i) // vai ser igual a 10, o método fez uma cópia

    - Por referência (endereço): o que é feito com o parâmetro dentro do método **altera** fora
- Sobrecarga: capacidade de definir métodos que se comportará de maneira diferente a depender do contexto, mas preservando o nome --> mantém o nome, mas troca a lista de tipos e quantidade de parâmetros

    Exemplo: método que converte para inteiro, faz ações diferentes dependendo se recebe float, double, etc.

- sobrescrita: diferente de sobrecarga, uma mesma ação **pode** se comportar de forma distinta, existe uma ação padrão, mas conforme necessidade, pode sobrescrever 

        @override
        ...

- polimorfismo: uma mesma ação (método) se comporta de maneira diferente, de acordo com a herança do objeto em questão

## Boas práticas ao lidar com métodos
- começar com letras minúsculas
- usar nomes expressivos, de modo que seja possível entender o propósito da variável, mas curtos
    - é comum utilizar uma combinação de verbo+substantivo(s)
- usar notação camelo
            
        verificarSaldo();
- possuir no máximo entre 80 e 120 linhas
    - podem ser criados métodos auxiliares (é comum um método ser utilizado dentro de outro)

- evitar lista longa de parâmetros
    - gera um acoplamento muito forte
- usar visibilidade (public, private,protected) adequada

## Métodos especiais
- construtor: permite a criação de objetos dentro da classe, deve ter o mesmo nome da Classe, pode prover valores iniciais para atributos

        //construtor vazio
        Classe(){

        }

        Classe(tipo atributo1, tipo atributo2){
            this.atributo1 = atributo1;
            this.atributo2 = atributo2;
        }

- destrutor: auxilia a destruição do objeto, coletor de lixo de POO chama destrutores para liberar recursos da memória, é uma boa prática de implementar

        class Classe{
            void finalize(){
                ...
            }
        }

- getter: método para obter valores dos atributos

        int getAtributo(int atributo){
            return atributo;
        }

- setter: método para fornecer valores aos atributos, sempre void

        void setAtributo(int atributo) {
            this.atributo = atributo;
        }
