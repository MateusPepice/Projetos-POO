
package main;

import controle.CadastroPessoa;
import controle.CadastroMedicamento;
import controle.CadastroProduto;
import controle.RealizarVenda;
import java.util.Scanner;
import util.Input;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static int escolha;
    
    public static void main(String[] args) {
        menu();
    }
    
   public static void menu(){
        
        do{
            System.out.println("\nX------MENU PRINCIPAL------X");

            System.out.println("1 - REALIZAR CADASTRO");
            System.out.println("2 - LISTAR CADASTROS");
            System.out.println("3 - REALIZAR VENDA");
            System.out.println("0 - SAIR DO SISTEMA");
            escolha = input.nextInt();
            
            switch (escolha){
                case 1:
                    moduloCadastros();
                    break;
                case 2:
                    moduloListagem();
                    break;
                case 3:
                    realizarVenda();
                    break;
                case 0:
                    System.out.println("\nSAINDO DO SISTEMA!");
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA!");
                    break;
            }
            
        } while (escolha !=0);
        
    }
    
    public static void moduloCadastros(){
        
        System.out.println("\nX-----MODULO DE CADASTROS-----X");
        
        System.out.println("1 - CADASTRAR FUNCIONARIO");
        System.out.println("2 - CADASTRAR CLIENTE");
        System.out.println("3 - CADASTRAR MEDICAMENTO CONTROLADO");
        System.out.println("4 - CADASTRAR MEDICAMENTO INJETAVEL");
        System.out.println("5 - CADASTRAR MEDICAMENTO");
        System.out.println("6 - CADASTRAR PRODUTO");
        escolha = input.nextInt();
    
        switch (escolha){
            case 1:
                 CadastroPessoa.cadastroFuncionario();
                 break;
            case 2:
                 CadastroPessoa.cadastroCliente();
                 break;
            case 3:
                 CadastroMedicamento.cadastroMedicamentoControlado();
                 break;
            case 4:
                 CadastroMedicamento.cadastroMedicamentoInjetavel();
                 break;
            case 5:
                 CadastroMedicamento.cadastroMedicamento();
                 break;
            case 6:
                 CadastroProduto.cadastrarProduto();
                 break;
            default:
                System.out.println("\nOPCAO INVALIDA!");
                break;
        }
    }
    
    public static void moduloListagem(){
    
        System.out.println("\nX-----MODULO DE LISTAGEM-----X");

        System.out.println("1 - LISTAR FUNCIONARIOS");
        System.out.println("2 - LISTAR CLIENTES");
        System.out.println("3 - LISTAR PRODUTOS (MEDICAMENTOS CONTROLADOS)");
        System.out.println("4 - LISTAR PRODUTOS (MEDICAMENTOS INJETAVEIS)");
        System.out.println("5 - LISTAR MEDICAMENTOS");
        System.out.println("6 - LISTAR PRODUTOS");
        System.out.println("7 - LISTAR VENDAS");
        System.out.println("8 - LISTAR DETALHES DA VENDA");

        escolha = input.nextInt();
        
        switch (escolha){
            case 1:
                CadastroPessoa.listarPessoas(1);
                break;
            case 2:
                CadastroPessoa.listarPessoas(2);
                break;
            case 3:
                CadastroProduto.listarProdutos(1);
                break;
            case 4:
                CadastroProduto.listarProdutos(2);
                break;
            case 5:
                CadastroProduto.listarProdutos(3);
                break;
            case 6:
                CadastroProduto.listarProdutos(4);
                break;
            case 7:
                RealizarVenda.listarVendas();
                break;
            case 8:
                RealizarVenda.exibirDetalhes();
                break;
            default:
                System.out.println("\nOPCAO INVALIDA!");
                break;
        }
    }
    
    public static void realizarVenda(){
        RealizarVenda.novaVenda();
    }
}
