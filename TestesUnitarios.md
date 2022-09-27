# Introdução a testes unitários com JUnit

Testes unitários consistem em realizar testes no menor nível possível nas aplicações, em resumo, nas funções, métodos.

A importância de se realizar testes unitários consiste em validar a aplicação, para garantir que está sendo executada de forma consistente e estável, conforme o esperado.

## Estrutura básica
        import org.junit.jupiter.api;
        import static org.junit.jupiter.api.Assertions.assertTrue //ou org.junit.jupiter.api.Assertions.* --> Não precisa ficar chamando Assertions.
        
        // pasta main
        public class NomeClasse {
            public Metodo(v1,v2){
                this.v1=v1;
                this.v2=v2
            }

            getters and setters
        }

        // Testes ficam separados, na pasta test
        public class ClasseTeste{
            @test //para indicar que o método a seguir é de teste
            void nomeDoTeste(){
                //construção de um cenário
                NomeClasse objetoClasse = new NomeClasse(v1=x,v2=y);
                //validação do cenário
                Assertions.assertEquals(valorESPERADO,objetoClasse.getV1());
                //Pode ser Assertions.assertTrue(variávelBooleana);
                //Assertions.assertFalse (variávelBooleana);
                //Assertions.assertArrayEquals(arrayEsperado,array2) ou Assertions.assertNotEquals(arrayEsperado,array2) compara arrays
                //Assertions.assertNull(variável) ou Assertions.assertNotNull(variável)
            
            @test //pode incluir vários testes, para cada variável
            ...
            }
        }

## Conceitos Before e after
        @BeforeAll roda uma vez antes de todos os testes
        @BeforeEach roda antes de cada teste
        @AfterAll roda uma vez depois de todos os testes
        @AfterEach roda depois de cada teste

## Assumptions 

        public class ClasseTeste{
            @test 
            void nomeDoTeste(){
                Assumptions.assumeTrue(condição);//só roda o teste para uma condição específica
                Assertions.assertEquals(previsto,valor)
            }
        }

## Testes condicionais

Não precisa de Assumptions:

        public class ClasseTeste{
            @test 
            @EnabledIfEnviromentVariable(nomedavariavel,valor) //@DisabledIfEnviromentVariable
            //@EnabledOnOs({OS.MAC,OS.Linux})
            //@EnabledOnJre(JAVA_17)
            //@EnabledForJreRange(min,max)
            void nomeDoTeste(){
                Assertions.assertEquals(previsto,valor)
            }
        }

## Teste em exceções

Para saber se as exceções estão sendo lançadas corretamente:

        public class ClasseTeste{
            @test 
            void nomeDoTeste(){
                NomeClasse objetoClasse = new nomeClasse(v1=x,v2=y);
                
                Assertions.assertThrows(nomeDaExcecao.class,lambda que gera a excecao); //ex: () -> classe.metodo(cvariaveis)
                //Assertions.assertDoesNotThrow
            }
        }

## Ordenando testes

        @TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Ordena conforme indicado
        //@TestMethodOrder(MethodOrderer.MethodName.class) respeita ordem alfabética
        //@TestMethodOrder(MethodOrderer.DisplayName.class) respeita ordem alfabética do @DisplayName("nomeAtribuido")
        public class ClasseTeste{
            @Order(2)
            @test 
            void nomeDoTeste1(){
                Assertions.assertTrue(valor);
            }

            @Order(1)
            @test 
            void nomeDoTeste2(){
                Assertions.assertTrue(valor);
            }
        }