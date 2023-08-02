
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
                case 1 -> moduloAluno();
                case 2 -> moduloFuncionario();
                case 3 -> moduloProfessor();
                case 4 -> moduloCoordenador();
                case 5 -> moduloCurso();
                case 6 -> moduloRelatorios();
                case 0 -> System.out.println("VOCE SAIU DO SISTEMA!");
                default -> System.out.println("OPCAO INVALIDA!");  
            }
        } while (resposta != 0);
    }
    
    public static void moduloAluno(){
       do {
           System.out.println("=====MODULO ALUNO=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
    public static void moduloFuncionario(){
       do {
           System.out.println("=====MODULO FUNCIONARIO=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
    public static void moduloProfessor(){
       do {
           System.out.println("=====MODULO PROFESSOR=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
    public static void moduloCoordenador(){
       do {
           System.out.println("=====MODULO COORDENADOR=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
    public static void moduloCurso(){
       do {
           System.out.println("=====MODULO CURSO=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
    public static void moduloRelatorios(){
       do {
           System.out.println("=====RELATÓRIOS GERENCIAIS=====");
           System.out.println("1 - CADASTRAR");
           System.out.println("2 - EXIBIR");
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
