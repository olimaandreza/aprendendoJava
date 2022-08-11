# Collections
- definição : é um **objeto** que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade
- serve para armazenar e processar dados de forma eficiente
- é um framework
- principais interfaces: List, Set, Map
- Stream API ajuda na manipulação de Collections

## Composição
- Interfaces: funciona como um contrato que quando assumido pela classe, deve ser implementado. Quando uma classe implementa uma Interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza
- Implementações ou classes: são as codificações ou materializações das interfaces
- Algoritmos: sequência lógica, finita e definida de instruções que devem ser seguidas para a resolução de um problema

## Coleções com iterações ordenadas - Interface List
- fica dentro do pacote java.util.List
- permite elementos duplicados
- garante ordem de inserção
- estende a interface Collections
- algumas formas para criar List:

        import java.util.ArrayList;
        import java.util.List;

        List nomeLista = new ArrayList();
        List<Double> nomeLista = new ArrayList<Double>(); // lista com elementos do tipo Double
        //diamond operator -> não é necessário escrever o segundo Double
        ArrayList<Double> nomeLista = new ArrayList<>(); //não é muito recomendado, pois não é instaciado pela interface
        List<Double> nomeLista = new ArrayList<>(Arrays.asList(elemento1,elemento2));
        List<Double> nomeLista = Arrays.asList(elemento1,elemento2); // essa forma é limitada, não executa nomeLista.add(elementonovo), não exclui elementos
        List<Double> nomeLista = List.of(elemento1,elemento2) //também é imutável
        List<ClasseCriada> nomeLista = new Arraylist<>(){{
                add(new ClasseCriada(elemento1.1,elemento1.2));
                add(new ClasseCriada(elemento2.1,elemento2.2));
        }}
        List<ClasseCriada> nomeLista = new Arraylist<>(outraLista);

- Métodos:

        lista.add(elemento); //adiciona um elemento
        lista.add(posição,elemento); //adiciona elemento na posição
        lista.remove(elemento); //remove um elemento, pode passar a posição também
        lista.toString(); // para não imprimir o endereço de memória
        lista.indexOf(elemento); //retorna a posição do elemento
        lista.set(posição,elemento); //substitui o elemento da posição
        lista.contains(elemento); //retorna true ou false
        lista.get(posição); //retorna elemento na posição
        lista.size(); // retorna o número de elementos na lista
        lista.clear(); //apaga toda a lista
        lista.isEmpty(); //retorna true ou false
        lista.sort(new ClasseComparator()); //ordena 

        import java.util.Collections;
        Collections.min(lista); // retorna o menor valor, só funciona para interface comparable
        Collections.max(lista); 
        Collections.shuffle(lista); //retorna lista em ordem aleatória
        Collections.sort(lista); //ordena a lista em ordem natural, desde que tenha a interface Comparable ou:
        Collections.sort(lista,new ClasseComparator());
        
        //Soma de elementos em uma lista:
        import java.util.Iterator;

        Iterator<Double> iterator = lista.iterator();
        Double soma=0d;
        while (iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
        }

        //Exemplo de ClasseComparator
        class ComparatorVariavel1 implements Comparator<ClasseCriada>{
                @Override
                public int compare(ClasseCriada elemento1,ClasseCriada elemento2){
                        return Integer.compare(elemento1.getVariavel1(),elemento2.getVariavel1())
                }
        }




### Implementação ArrayList
- é uma classe que implementa a interface List
- preferível quando há necessidade de mais operações de busca
- na dúvida, escolha ArrayList

### Implementação LinkedList
- é uma classe que implementa interface List e Queue
- preferível quando há necessidade de mais operações de inserção e exclusão

### Implementação Vector
- trata de threads

## Coleções com singularidade - Interface Set
- fica dentro do pacote java.util.Set
- não permite elementos duplicados
- não possui índice
- estende a interface Collections


### Implementação HashSet
- implementa a interface Set
- não mantém ordem de inserção de elementos, ao contrário da LinkedHashSet
- tem a melhor performance
- permite no máximo um elemento null
- não lida com posições e substituições de valores
- inicialização de um Set:

                import java.util.Set;

                Set conjunto = new HashSet();
                HashSet<Double> conjunto = new HashSet<>(); // Set com elementos do tipo Double
                Set<Double> conjunto = new HashSet<>();
                Set<Double> conjunto = Set.of(numero1,numero2);
                Set<Double> conjunto = new HashSet<>(Arrays.asList(numero1,numero2));
                Set<Double> conjunto = new LinkedHashSet<>();
                Set<Double> conjunto = new TreeSet<>();
                Set<Double> conjunto = new TreeSet<>(outroSet);


- Métodos:

                conjunto.add(elemento);
                conjunto.remove(elemento);
                conjunto.toString();
                conjunto.contains(elemento);
                conjunto.size(conjunto);
                conjunto.clear();
                conjunto.isEmpty();
                conjunto.addAll(collection);

                import java.util.Collections;
                Collections.min(conjunto); // retorna o menor valor, só funciona para interface comparable
                Collections.max(conjunto); 

                //Soma de elementos em uma lista:
                import java.util.Iterator;

                Iterator<Double> iterator = conjunto.iterator();
                Double soma=0d; 
                while (iterator.hasNext()){
                        Double next = iterator.next();
                        soma += next;
                }

#### Implementação LinkedHashSet
- extends da implementação HashSet
- mantém ordem de inserção de elementos
- tem melhor performance apenas quanto ao TreeMap
- permite no máximo um elemento null


### Interface SortedSet
- Extends da interface Set

#### Interface NavigableSet
- extends da interface SortedSet

##### Implementação TreeSet
- Implementa interface NavigableSet
- importante para ordenação, mantém ordem natural
- não permite elemento null


## Coleções de pares - Interface Map 
- não é uma Collection porque não se estende da **interface** collection, mas está inserida no universo de collections framework
- é um objeto que pode colocar múltiplos elementos
- apresenta elementos key únicos para cada valor (dicionário Python)
- inicializar um Map:

                import java.util.Map;
                Map dicionario = new HashMap();
                Map<String,Double> dicionario = new HashMap<>(); //cria um Map chamado dicionario com key do tipo String e valor do tipo Double
                HashMap<String,Double> dicionario = new HashMap<>();
                Map<String,Double> dicionario = Map.of("chave1",valor1,"chave2",valor2);
                Map<String,Double> dicionario = new HashMap<>(){{
                        put("chave1",valor1);
                        put("chave2",valor2);
                }}
                Map<String,Double> dicionario = new LinkedHashMap<>(){{
                        put("chave1",valor1);
                        put("chave2",valor2);
                }}
                Map<String,Double> dicionario = new TreeMap<>(){{
                        put("chave1",valor1);
                        put("chave2",valor2);
                }}
                Map<String,Double> dicionario = new TreeMap<>(outroDicionario);

- métodos:
                dicionario.put("chave",valor); // no lugar de .add, adiciona um novo ou substitui existente
                dicionario.toString();
                dicionario.containsKey("chave");
                dicionario.get("chave"); //retorna o valor
                dicionario.keySet(); //retorna um Set com as chaves
                dicionario.values(); //retorna os valores em uma collection
                dicionario.size();
                dicionario.remove();
                dicionario.clear();
                dicionario.isEmpty();
                
                import java.util.Collections;
                Double valorMax = Collections.max(dicionario.values());
                Set<Map.Entry<String,Double>>entries = dicionario.entrySet(); // interface entry retorna um Set com elementos do tipo entry
                String chaveMax = "";
                for (Map.Entry<String,Double> entry:entries){
                        if(entry.getValue().equals(valorMax))
                                chaveMax = entry.getKey();
                }

                Double valorMin = Collections.min(dicionario.values());
                String chaveMin = "";
                for(Map.Entry<String,Double> entry : dicionario.entrySet()){
                        if(entry.getValue().equals(valorMin))
                                chaveMin = entry.getKey();
                }

                Double soma = 0d;
                Iterator<Double> iterator = dicionario.values().iterator();
                while (iterator.hasNext()){
                        soma+=iterator.next();
                }

                Iterator<Double> iterator = dicionario.values().iterator();
                while (iterator.hasNext()){
                        if (iterator.next().equals(valor))
                                iterator.remove();
                }


### HashMap
- implementa interface Map
- itera elementos de modo aleatório
- permite chave null

#### LinkedHashMap
- estende da hashmap
- itera elementos de acordo com ordem de inserção ou ordem de acesso, conforme especificações na construção
- permite chave null

### HashTable
- é thread safe
- implementa a interface Map

### Interface SortedMap
- estende da interface Map

#### NavigableMap
- estende da interface SortedMap

##### TreeMap
- implementa a interface SortedMap
- importante para comparação/ordenação
- é mais complexo que HashMap e LinkedHashMap
- itera elementos pela ordem natural das chaves ou comparator
- não permite chave nula


## Interface Queue

## Stream API
- Classe Anônima: classe que não recebe nome, declarada e instanciada em uma única instrução, usada quando será utilizada apenas uma vez
- Funcional interface: qualquer interface com um Single Abstract Method (SAM), ou seja, só possui um método abstrato, cuja implementação pode ser tratada como expressões lambda. Ex: Comparator só tem um método abstrato, que é o compare. Os outros métodos não são abstratos.
        - Comparator
        - Consumer
        - Function
        - Predicate
- Função lambda: é uma função sem declaração, ou seja, não precisa nome, nem tipo de retorno, nem tipo de acesso, instanciada no momento em que será utilizada. Sintaxe: (argumento) -> (corpo)
- Reference method: permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado em um local específico do código, tornando-o mais simples e legível. Usada para simplificar uma lambda. Sintaxe: informar classe ou referência + :: + nome do método sem os parênteses ao final.
- Stream API: outra opção para manipular Collections, segue os princípios de programação funcional, recebe uma expressão lambda, não modifica a fonte

source -> pipeline -> terminal (retorna um objeto ou valor)

- exemplo:

                List<String> lista = Arrays.asList("1","2");
                
                //print de cada elemento da lista
                lista.stream().forEach(s->sysout(s)); //Stream com lambda
                lista.forEach(s->sysout(s)); //lambda
                lista.forEach(system.out::println); //reference method

                //pegar os x primeiros elementos
                lista.stream().limit(x).collect(Collectors.toSet()).forEach(system.out::println) //collect leva de um lugar para outro

                //transformar em lista de Integer
                List<Integer> listaInteger = lista.stream().map(Integer::parseInt).collect(Collectors.toList()); //map converte

                //salvar numeros pares e maiores que 2
                List<Integer> listaIntegerPar = lista.stream().map(Integer::parseInt).filter( predicate -> predicate%2==0 && predicate >2 ).collect(Collectors.toList());

                //média
                lista.stream().mapToInt(Integer::parseInt).average().ifPresent(system.out::println); //maptoInt para fazer operações em cada elemento
                //ifPresent é optional

                //remover ímpares
                listaInteger.removeIf(predicate -> predicate %% 2 > 0 )



