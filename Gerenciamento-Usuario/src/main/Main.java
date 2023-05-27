package main;

import controle.CadastroCliente;
import controle.CadastroGerente;
import controle.CadastroVendedor;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import util.Input;

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
                case 4 -> listarGerentes();
                case 5 -> listarVendedores();
                case 6 -> listarClientes();
                case 0 -> System.out.println("\nSAINDO DO SISTEMA!!");
                default -> System.out.println("\nOPCAO INVALIDA!!");
            }
            
        }while (escolha != 0);
    }
    
    public static void cadastroGerente(){
        CadastroGerente.cadastrar();
    }
    public static void cadastroVendedor(){
        CadastroVendedor.cadastrar();
    }
    public static void cadastroCliente(){
        CadastroCliente.cadastrar();
    }
    
    public static void listarGerentes(){
        CadastroGerente.listarGerentes();
    }
    public static void listarVendedores(){
        CadastroVendedor.listarVendedores();
    }
    public static void listarClientes(){
        CadastroCliente.listarClientes();
    }
}
