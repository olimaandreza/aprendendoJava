//Criar classe que se chama mensagem e método que retorna saudação conforme o horário informado

public class Mensagem {
    public static void obterMensagem(int hora){
        if (hora >= 4 & hora < 12) {
            mensagemBomdia(); //exemplo de método dentro de método9
        } 
        else if (hora >= 12 & hora < 18){
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
    }

    // Outra abordagem seria usar o switch case
    public static void obterMensagem2(int hora){
        switch(hora){
        case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11:
            mensagemBomdia(); //exemplo de método dentro de método9
            break;
        case 12: case 13: case 14: case 15: case 16: case 17: case 18:        
            System.out.println("Boa tarde!");
            break;
        case 19: case 20: case 21: case 22: case 23: case 24: case 0: case 1: case 2: case 3:
            System.out.println("Boa noite!");
            break;
        default: 
            System.out.println("Valor inválido, insira um valor inteiro de 0  a 24.");
            break;
        }
    }

    public static void mensagemBomdia() {
        System.out.println("Bom dia!");
    }
}





