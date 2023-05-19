package main;

import controle.CadastroAluno;
import controle.CadastroDiretor;
import controle.CadastroFuncionario;
import controle.CadastroPessoa;
import controle.CadastroProfessor;
import java.util.Scanner;

public class Main {
    private static int escolha;
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        do{
            System.out.println("\n-------MENU DE OPÇÕES------");
            
            System.out.println("1 - Cadastro de alunos");
            System.out.println("2 - Cadastro de diretores");
            System.out.println("3 - Cadastro de funcioários");
            System.out.println("4 - Cadastro de pessoas");
            System.out.println("5 - Cadastro de professores");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> cadastroAluno();
                case 2 -> cadastroDiretor();
                case 3 -> cadastroFuncionario();
                case 4 -> cadastroPessoa();
                case 5 -> cadastroProfessor();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0);
    }
    
    public static void cadastroAluno(){
        do{
            System.out.println("\n-------MENU DE OPÇÕES (CADASTRO DE ALUNOS)------");
            
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar alunos cadastrados");
            System.out.println("4 - Editar aluno");
            System.out.println("9 - Voltar ao menu principal");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> CadastroAluno.cadastrar();
                case 2 -> CadastroAluno.excluir();
                case 3 -> CadastroAluno.listarCadastrados();
                case 4 -> CadastroAluno.editar();
                case 9 -> menuPrincipal();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0);
    }
    
    public static void cadastroDiretor(){
        do{
            System.out.println("\n-------MENU DE OPÇÕES (CADASTRO DE DIRETORES)------");
            
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar diretores cadastrados");
            System.out.println("4 - Editar diretor");
            System.out.println("9 - Voltar ao menu principal");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> CadastroDiretor.cadastrar();
                case 2 -> CadastroDiretor.excluir();
                case 3 -> CadastroDiretor.listarCadastrados();
                case 4 -> CadastroDiretor.editar();
                case 9 -> menuPrincipal();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0);
    }
    
    public static void cadastroFuncionario(){
        do{
            System.out.println("\n-------MENU DE OPÇÕES (CADASTRO DE FUNCIONÁRIOS)------");
            
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar funcionários cadastrados");
            System.out.println("4 - Editar funcionário");
            System.out.println("9 - Voltar ao menu principal");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> CadastroFuncionario.cadastrar();
                case 2 -> CadastroFuncionario.excluir();
                case 3 -> CadastroFuncionario.listarCadastrados();
                case 4 -> CadastroFuncionario.editar();
                case 9 -> menuPrincipal();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0); 
    }
    
    public static void cadastroPessoa(){
        do{
            System.out.println("\n-------MENU DE OPÇÕES (CADASTRO DE PESSOAS)------");
            
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar pessoas cadastrados");
            System.out.println("4 - Editar pessoa");
            System.out.println("9 - Voltar ao menu principal");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> CadastroPessoa.cadastrar();
                case 2 -> CadastroPessoa.excluir();
                case 3 -> CadastroPessoa.listarCadastrados();
                case 4 -> CadastroPessoa.editar();
                case 9 -> menuPrincipal();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0);
    }
    
    public static void cadastroProfessor(){
       do{
            System.out.println("\n-------MENU DE OPÇÕES (CADASTRO DE PROFESSORES)------");
            
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar professores cadastrados");
            System.out.println("4 - Editar professor");
            System.out.println("9 - Voltar ao menu principal");
            System.out.println("0 - Sair do sistema");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> CadastroProfessor.cadastrar();
                case 2 -> CadastroProfessor.excluir();
                case 3 -> CadastroProfessor.listarCadastrados();
                case 4 -> CadastroProfessor.editar();
                case 9 -> menuPrincipal();
                case 0 -> System.out.println("\nSaindo do sistema...");
                default -> System.out.println("\nOpção inválida!");
            }
            
        }while(escolha != 0); 
    }
    
    
}
