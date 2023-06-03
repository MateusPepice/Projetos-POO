
package main;

import controle.CadastroPessoa;
import controle.CadastroProduto;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static int escolha;
    
    public static void main(String[] args) {
        
    }
    
     public static void menu(){
        
        do{
            System.out.println("X------MENU PRINCIPAL------X");

            System.out.println("1 - CADASTRAR FUNCIONARIO");
            System.out.println("2 - CADASTRAR CLIENTE");
            System.out.println("3 - CADASTRAR MEDICAMENTO CONTROLADO");
            System.out.println("4 - CADASTRAR MEDICAMENTO INJETAVEL");
            System.out.println("5 - REALIZAR VENDA");
            System.out.println("0 - SAIR DO SISTEMA");
            escolha = input.nextInt();
            
            switch (escolha){
                case 1:
                    CadastroPessoa.cadastroFuncionario();
                    break;
                case 2:
                    CadastroPessoa.cadastroCliente();
                    break;
                case 3:
                    CadastroProduto.cadastroMedicamentoControlado();
                    break;
                case 4:
                    CadastroProduto.cadastroMedicamentoInjetavel();
                    break;
                default:
                    System.out.println("\nSAINDO DO SISTEMA!");
                    break;
            }
            
        } while (escolha !=0);
        
    }
    
}
