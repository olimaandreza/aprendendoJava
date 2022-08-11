//Conhecendo Arrays em Java

import java.util.Random;

public class TrabalhandoArray {
    public static void main(String[] args) {
        // criar um vetor e mostrar na ordem inversa
        int[] vetor = {1,2,3,4,5,6}; //cria um array de elementos int

        System.out.println(vetor); //printa apenas a posição do array na memória
        //precisa usar loop para pegar cada elemento
        
        int count = vetor.length-1; // porque a indexação começa no 0
        while(count >=0 ){
            System.out.println(vetor[count]);
            count--;
        }

        //foreach
        for (int i : vetor) {
            System.out.println(i);
        }

        //criar matriz 4x4 com números aleatórios
        Random random = new Random(); //cria objeto random da classe Random
        int[][] bidimensional = new int[4][4]; //cria matriz

        for (int i = 0; i < bidimensional.length;i++) {
            for(int j = 0;j < bidimensional[i].length;j++){
                bidimensional[i][j]=random.nextInt(9); //cria um número aleatório de 0 a 9
            }
        }

        for (int[] linha : bidimensional) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();            
        }
    }
}
