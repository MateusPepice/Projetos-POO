package main;

import controle.CadastroVendedor;
import java.util.Scanner;

public class Main {
    private static int escolha;
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        do{
            System.out.println("X------MENU PRINCIPAL------X");
            System.out.println("1 - CADASTRAR GERENTE");
            System.out.println("2 - CADASTRAR VENDEDOR");
            System.out.println("3 - CADASTRAR CLIENTE\n");
            System.out.println("4 - LISTAR GERENTES");
            System.out.println("5 - LISTAR VENDEDORES");
            System.out.println("6 - LISTAR CLIENTES");
            
            escolha = input.nextInt();
            
            switch(escolha){
                case 1 -> cadastroGerente();
                case 2 -> cadastroVendedor();
                case 3 -> cadastroCliente();
                case 0 -> System.out.println("\nSAINDO DO SISTEMA!!");
                default -> System.out.println("\nOPCAO INVALIDA!!");
            }
            
        }while (escolha != 0);
    }
    
    public static void cadastroGerente(){
        
    }
    
    public static void cadastroVendedor(){
        CadastroVendedor.cadastrar();
    }
    
    public static void cadastroCliente(){
    
    }
}
