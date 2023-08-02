
package main;

import util.Input;

public class Main {
    static int resposta;
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        do{
            System.out.println("=====MENU PRINCIPAL=====");
            System.out.println("1 - MODULO ALUNO");           
            System.out.println("2 - FUNCIONARIO");           
            System.out.println("3 - PROFESSOR");           
            System.out.println("4 - COORDENADOR");           
            System.out.println("5 - CURSO");           
            System.out.println("6 - GERAR RELATÓRIOS");           
            System.out.println("0 - SAIR DO SISTEMA");    
            resposta = Input.nextInt();
            
            switch(resposta){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    
                    break;
                case 0:
                    System.out.println("VOCE SAIU DO SISTEMA!");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!");
                    break;  
            }
        } while (resposta != 0);
    }
    
    public static void moduloAluno(){
       do {
           System.out.println("=====MODULO ALUNO=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - LER");
           System.out.println("3 - ALTERAR");
           System.out.println("4 - DELETAR");
           System.out.println("5 - VOLTAR");
           System.out.println("0 - SAIR DO SISTEMA");
           resposta = Input.nextInt();
           
           switch (resposta){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   menu();
                   break;
               case 0:
                   System.out.println("VOCE SAIU DO SISTEMA!");
                   break;
           }
       } while (resposta != 0);
    }
}
