public class Main {
    public static void main(String[] args) {
        //Chama métodos da classe Soma
        System.out.println( "Resultado soma: " + Calculadora.soma(2,3));
        Calculadora.subtracao(7,2);
        Calculadora.multiplicacao(2, 4);
        Calculadora.divisao(10, 3);

        System.out.println("===========");
        //Chama métodos da classe Mensagem
        //chamada pelo If
        Mensagem.obterMensagem(5);

        //chamada pelo switch/case
        Mensagem.obterMensagem2(25);
        Mensagem.obterMensagem2(2);

    }
}

