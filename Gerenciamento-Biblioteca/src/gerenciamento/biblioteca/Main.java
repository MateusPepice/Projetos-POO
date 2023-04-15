package gerenciamento.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Usuario usuario[] = new Usuario[30];
    static int qtdUsuario = 0;
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Usuario usuario = new Usuario();
        
        int escolha = 0;
        int quantidade = 0;
        
        do{
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Editar aluno");
            System.out.println("3 - Cadastrar livro");
            System.out.println("4 - Editar livro");
            System.out.println("5 - Pesquisar aluno (matrícula)");
            System.out.println("6 - Pesquisar livro (código)");
            System.out.println("7 - Realizar empréstimo");
            System.out.println("8 - Realizar devolução");
            System.out.println("9 - Gerar relatórios");
            System.out.println("0 - SAIR");
            escolha = input.nextInt();

            switch(escolha){
                case 1:
                    System.out.println("Quantos registros deseja cadastrar?");
                    quantidade = input.nextInt();
                    
                    for (int i = qtdUsuario; i <quantidade && i<30; i++) {
                        System.out.println("Informe CPF: ");
                        long cpf = input.nextLong();
                        System.out.println("Informe matrícula: ");
                        int matricula = input.nextInt();
                        System.out.println("Informe nome: ");
                        String nome = input.next();
                        System.out.println("Informe telefone: ");
                        String telefone = input.next();
                        
                        usuario.setCpf(cpf);
                        usuario.setMatricula(matricula);
                        usuario.setNome(nome);
                        usuario.setTelefone(telefone);
                        qtdUsuario++;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Quantos registros deseja cadastrar?");
                    quantidade = input.nextInt();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    System.out.println("Saindo do sistema!");
                    break;
            }
        } while(escolha != 0);
    }

}