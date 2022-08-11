//Conhecendo operadores, tipos de variáveis e casting em Java

public class Operadores {

    public static void main(String[] args)  {
        /*System.out.println("Hello, World!");*/

        /***** Trabalhando com operadores aritméticos *****/
        /* Adição */
        float a = 4.5F  +5.5F;
        System.out.println("adição:"+ a);

        /* Subtração */
        int s = 10 - 5;
        System.out.println("subtração: "+s);

        /* Multiplicação */
        long m = 10389L * 5L;
        System.out.println("m antes da atribuição: " + m);

        /* Divisão */
        double d = 45.0/4;
        System.out.println("d antes da atribuição: "+d);

        /* Módulo */
        int k = 15 % 4;
        System.out.println("k antes da atribuição: "+k);

        /***** Trabalhando com operadores pós-fixados *****/
        int j = k--; /* equivalente a j=k; k=k-1;  */
        System.out.println("j: "+j);
        System.out.println("k depois do pós-fixado: "+k);

        /***** Trabalhando com operadores pré-fixados *****/
        int i = ++k; /* equivalente a int i = k+1 */
        System.out.println("i: " + i);
        System.out.println("k depois do pré-fixado: "+k);

        /***** Trabalhando com operadores de atribuição *****/
        double c = a;
        System.out.println("c: "+ c);

        i += 5; /* i = i + 5 */
        System.out.println("i depois da atribuição +=5: " + i);

        j -= 3; /* j = j - 3 */
        System.out.println("j depois da atribuição -=3: " + j);

        d /= 2; /* d = d/2 */
        System.out.println("d depois da atribuição /=2: " + d);
        m *= 2; /* m = m * 2 */
        System.out.println("m depois da atribuição *=2: "+m);
        k %= 2; /* k = k % 2 */
        System.out.println("k depois da atribuição %2: "+k);

        int z = k = j; /* k recebe j, z recebe k */
        System.out.println("z: "+z);

        /***** Casting *****/
        /* upcasting */
        d = a; /* double recebendo float, implícito (a promovido para double) */

        /* downcasting */
        i = (int) m; /* int recebendo long, tem que ser explícito */
        j = (int) d; /* trunca o valor de d */
        System.out.println("double downcasted: " + j);

        /***** Operadores lógicos *****/
        // && - and
        // || - or
        // ^  - xor --> se ambos true ou ambos false, retorna false. true nos demais casos
        // !  - negação
        // Boa prática: usar variáveis para guardar resultados lógicos intermediários

        /***** Outros operadores *****/
        // operadores bitwise: & e |
        // operadores shift: ~ >> >>> <<

    }
}
