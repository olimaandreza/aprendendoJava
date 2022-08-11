//Criar uma classe que se chama calculadora e métodos que fazem as quatro operações básicas com 2 operandos

public class Calculadora {

    public static double soma(double n1,double n2) {
        return n1 + n2; // para usar essa forma tem que ser double em vez de void no método
        // double resultado = n1 + n2; 
        // System.out.println("O resultado é: " + resultado);
    }

    //outra forma
    public static void subtracao(double n1,double n2) {
        // return n1 - n2;
        double resultado = n1 - n2; 
        System.out.println(n1 + " - " + n2 + " = " + resultado);
    }

    public static void multiplicacao(double n1,double n2) {
        // return n1 * n2;
        double resultado = n1 * n2; 
        System.out.println(n1 + " * " + n2 + " = " + resultado);
    }

    public static void divisao(double n1,double n2) {
        // return n1 / n2;
        double resultado = n1 / n2; 
        System.out.println(n1 + " / " + n2 + " = " + resultado);
    }

}
