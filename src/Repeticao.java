//Conhecendo estruturas de repetição

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        
        //leia dois valores, o primeiro nome, o segundo idade.
        //interrompa com a entrada de zero na posição do nome

        Scanner scan = new Scanner(System.in); //Scanner é uma classe que auxilia a leitura do teclado

        String nome; //cria variável do tipo String chamada nome
        int idade; //cria variável do tipo int chamada idade

        /***** While *****/
        while(true){
            System.out.println("Digite Nome: ");
            nome = scan.next();
            if (nome.equals("0")) //outra forma de relação de igualdade
                break;
            System.out.println("Digite Idade: ");
            idade = scan.nextInt();
        }

        //peça uma nota de 0 a 10, mostra mensagem se for inválido e pede para repetir
        int nota;

        System.out.println("Insira a nota: ");
        nota = scan.nextInt();
        while (nota>10 || nota < 0 ){
            System.out.println("Valor inválido!");
            System.out.println("Insira a nota: ");
            nota = scan.nextInt();
        }

        //leia 5 números e informe o maior e a média
        int contador = 0;
        int numero;
        int soma = 0;
        int maior = 0;

        /***** Do-While*****/
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero>maior) 
                maior = numero;
            soma+=numero;
            ++contador;
        } while (contador < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: "+  soma/contador);

        // Criar um gerador de tabuada
        System.out.println("Tabuada de qual número? ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabuada de " + tabuada + ":");
        /***** For *****/
        for (int i = 1; i <= 10 ; i++){
            System.out.println( tabuada + " x " + i + " = " + tabuada*i);
        }
    }
}
