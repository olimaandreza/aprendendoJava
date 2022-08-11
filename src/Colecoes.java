// Conhecendo Collections em Java 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Colecoes {
    public static void main(String[] args) {

        /*****         LISTS          *****/

        List<Double> notas = new ArrayList<>();
        System.out.println("Lista vazia: "+ notas);
        notas.add(1d); //adiciona um elemento
        System.out.println("Lista com 1 elemento: "+notas);
        notas.add(1, 2.5); //adiciona elemento na posição indicada
        System.out.println("Lista com adição de um elemento no index 1: " + notas);

        System.out.println("Posição do elemento 2.5: " + notas.indexOf(2.5)); 
        notas.add(1,8d); //toma o lugar do anterior e empurra
        System.out.println("Lista com adição de um elemento no index 1: " +notas);

        notas.set(2,3d); //substitui o valor nesta posição
        System.out.println("Lista com substituição do elemento no index 2: " +notas);

        //verifica se contém um valor
        System.out.println("Contém elemento 2.5: " + notas.contains(2.5)); 
        System.out.println("Contém elemento 3: " + notas.contains(3d)); 

        System.out.println("Elemento na posição 2: "+ notas.get(2));

        System.out.println("Valor Mínimo: " + Collections.min(notas)); //só funciona para interface comparable

        //Soma:
        Iterator<Double> iterator = notas.iterator();
        Double soma=0d;
        while (iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
        }
        System.out.println("Soma dos elementos via iterator: "+ soma);

        //Remover os elementos < 2
        Iterator<Double> iterator2 = notas.iterator(); //avalia elemento a elemento

        while (iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 2)
                iterator2.remove();
        }
        System.out.println("Exclui valores <2: " + notas);

        /*****         SETS          *****/
        //Os métodos são parecidos

        Set<Double> notas2 = new HashSet<>(Arrays.asList(10.0,5d,3.5,7d,7d,2.2));
        System.out.println("HashSet: "+ notas2); //observe que não fica na ordem e não repete o 7
    }
}
