package main;

import controle.CadastroClientes;
import controle.CadastroPessoa;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        int escolha = 0;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("\n-----MENU DE OPÇÕES-----\n");
            System.out.println("1 - Abrir nova conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Cadastrar novo cliente");
            System.out.println("4 - Excluir cliente");
            System.out.println("5 - Editar conta");
            System.out.println("6 - Editar pessoa");
            System.out.println("7 - Depositar");
            System.out.println("8 - Sacar");
            System.out.println("9 - Pagar taxa de manutenção");
            System.out.println("10 - Listar contas");
            System.out.println("11 - Listar clientes");
            System.out.println("0 - SAIR");
            escolha = input.nextInt();

            switch(escolha){
                case 1 -> CadastroClientes.abrirConta();
                case 2 -> CadastroClientes.fecharConta();
                case 3 -> CadastroPessoa.cadastrar();
                case 4 -> CadastroPessoa.remover();
                case 5 -> CadastroClientes.editarConta();
                case 6 -> CadastroPessoa.editarPessoa();
                case 7 -> CadastroClientes.depositar();
                case 8 -> CadastroClientes.sacar();
                case 9 -> CadastroClientes.pagarMensal();
                case 10 -> CadastroClientes.listarContas();
                case 11 -> CadastroPessoa.listarClientes();
                case 0 -> System.out.println("Saindo do sistema!");
                default -> System.out.println("Opção inválida!");
            }
        }
        while(escolha != 0);
    }
    
}
