package gerenciamento.biblioteca;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Usuario usuario[] = new Usuario[30];
    static Livro livro[] = new Livro[30];
    static Emprestimo emprestimo[] = new Emprestimo[30];
    static int qtdUsuario = 0;
    static int qtdLivro = 0;
    static int qtdEmprestimo = 0;
    static Scanner input = new Scanner (System.in);
    static int aux = 0;
    static int aux2 = 0;
    
    
    public static void main(String[] args) throws IOException {
        int escolha;
        int escolha_9;
        
        do{
            System.out.println("------MENU DE OPÇÕES-----");
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
                    CadastrarAluno();
                    break;
                case 2:
                    EditarAluno();
                    break;
                case 3:
                    CadastrarLivro();
                    break;
                case 4:
                    EditarLivro();
                    break;
                case 5:
                    PesquisarAluno();
                    break;
                case 6:
                    PesquisarLivro();
                    break;
                case 7:
                    RealizarEmprestimo();
                    break;
                case 8:
                    RealizarDevolucao();
                    break;
                case 9:
                    System.out.println("1 - Listagem de alunos cadastrados");
                    System.out.println("2 - Listagem de livros cadastrados");
                    System.out.println("3 - Listagem de livros emprestados");
                    escolha_9 = input.nextInt();
                    Relatorio(escolha_9);
                    break;
                case 0:
                    System.out.println("Saindo do sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.in.read();
                    break;
            }
        } while(escolha != 0);
    }
    
    public static void CadastrarAluno() throws IOException{
        
        System.out.println("-----CADASTRO DE NOVO ALUNO-----");
        if(qtdUsuario < 30){ // Verificação se o vetor já está cheio
            System.out.println("Quantos registros deseja cadastrar?");
            int quantidade = input.nextInt();
            
            for (int i = 0; i <quantidade; i++) { //Loop para percorrer o vetor
                System.out.printf("\nREGISTRO "+(i+1)+"\n");
                if (usuario[i] == null){ // Verifição se determinada posição do vetor está vazia ou não
                    System.out.println("Informe CPF: ");
                    long cpf = input.nextLong();
                    System.out.println("Informe matrícula: ");
                    int matricula = input.nextInt();
                    System.out.println("Informe nome: ");
                    String nome = input.next();
                    System.out.println("Informe telefone: ");
                    input.nextLine();
                    String telefone = input.next();

                    usuario[qtdUsuario]= new Usuario(cpf, nome, matricula, telefone);
                    qtdUsuario++;
                    System.in.read();
                } else {
                    System.out.printf("Posição"+qtdUsuario+"ocupada!"); 
                    System.in.read();
                }
            }
            
        } else {
            System.out.printf((qtdUsuario == 30) ? "Lista cheia" : "Erro!!!");
        }
    }
    
    public static void EditarAluno(){
        
        do{
            System.out.println("Qual posição deseja editar?");
            aux = input.nextInt();
        
            System.out.println("O que deseja alterar?");
            System.out.println("1 - CPF");
            System.out.println("2 - Nome");
            System.out.println("3 - Matrícula");
            System.out.println("4 - Telefone");
            System.out.println("0 - Cancelar alteração");
            aux2 = input.nextInt();
            
            if (aux2 == 0) continue;

            switch(aux2){
                case 1:
                    System.out.println("Novo CPF: ");
                    int cpf = input.nextInt();
                    usuario[aux].setCpf(cpf);
                    break;
                case 2:
                    System.out.println("Novo nome: ");
                    String nome = input.next();
                    usuario[aux].setNome(nome);
                    break;
                case 3:
                    System.out.println("Nova matrícula: ");
                    int matricula = input.nextInt();
                    usuario[aux].setMatricula(matricula);
                    break;
                case 4:
                    System.out.println("Novo telefone: ");
                    String telefone = input.next();
                    usuario[aux].setTelefone(telefone);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja alterar mais alguma coisa? 1 - SIM; 0 - NÃO");
            aux2 = input.nextInt();
        } while (aux2 != 0);
    }
    
    public static void CadastrarLivro() throws IOException{
        
        System.out.println("-----CADASTRO DE NOVO LIVRO-----");
        if(qtdLivro < 30){ // Verificação se o vetor já está cheio
            System.out.println("Quantos registros deseja cadastrar?");
            int quantidade = input.nextInt();
            
            for (int i = 0; i <quantidade; i++) { //Loop para percorrer o vetor
                if (livro[i] == null){ // Verifição se determinada posição do vetor está vazia ou não
                    System.out.printf("\nREGISTRO "+i+"\n");
                    System.out.println("Código: ");
                    int codigo = input.nextInt();
                    System.out.println("Ano: ");
                    int ano = input.nextInt();
                    System.out.println("Edição: ");
                    int edicao = input.nextInt();
                    System.out.println("Título: ");
                    String titulo = input.next();
                    System.out.println("Autor: ");
                    String autor = input.next();
                    System.out.println("Editora: ");
                    String editora = input.next();
                    System.out.println("ISBN: ");
                    String ISBN = input.next();

                    livro[qtdLivro]= new Livro(codigo, ano, edicao, titulo, autor, editora, ISBN);
                    qtdLivro++;
                    System.in.read();
                } else {
                    System.out.printf("Posição"+qtdLivro+"ocupada!");
                    System.in.read();
                }
            }
            
        } else {
            System.out.printf((qtdUsuario == 30) ? "Lista cheia" : "Erro!!!");
        }
         
    }
    
    public static void EditarLivro(){
        
        do{
            System.out.println("Qual posição deseja editar?");
            aux = input.nextInt();
        
            System.out.println("O que deseja alterar?");
            System.out.println("1 - Código");
            System.out.println("2 - Ano");
            System.out.println("3 - Edição");
            System.out.println("4 - Título");
            System.out.println("5 - Autor(a)");
            System.out.println("6 - Editora");
            System.out.println("7 - ISBN");
            System.out.println("0 - Cancelar alterações");
            aux2 = input.nextInt();

            switch(aux2){
                case 1:
                    System.out.println("Novo código: ");
                    int codigo = input.nextInt();
                    livro[aux].setCodigo(codigo);
                    break;
                case 2:
                    System.out.println("Novo ano: ");
                    int ano = input.nextInt();
                    livro[aux].setAno(ano);
                    break;
                case 3:
                    System.out.println("Nova edição: ");
                    int edicao = input.nextInt();
                    livro[aux].setEdicao(edicao);
                    break;
                case 4:
                    System.out.println("Novo título: ");
                    String titulo = input.next();
                    livro[aux].setTitulo(titulo);
                    break;
                case 5:
                    System.out.println("Novo autor(a): ");
                    String autor = input.next();
                    livro[aux].setAutor(autor);
                    break;
                case 6:
                    System.out.println("Nova editora: ");
                    String editora = input.next();
                    livro[aux].setEditora(editora);
                    break;
                case 7:
                    System.out.println("Novo ISBN: ");
                    String ISBN = input.next();
                    livro[aux].setISBN(ISBN);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja alterar mais alguma coisa? 1 - SIM; 0 - NÃO");
            aux2 = input.nextInt();
        } while (aux2 != 0);
    }
    
    public static void PesquisarAluno() throws IOException{
        System.out.println("-----PESQUISA DE ALUNO(MATRÍCULA)-----");
        System.out.println("Informe a matrícula do aluno: ");
        int matricula = input.nextInt();
        
        for (int i = 0; i < qtdUsuario; i++) {
            if(usuario[i].getMatricula() == matricula){
                System.out.println("-----RESULTADO-----");
                System.out.printf("CPF:"+usuario[i].getCpf()+"\n");
                System.out.printf("Nome:"+usuario[i].getNome()+"\n");
                System.out.printf("Telefone:"+usuario[i].getTelefone()+"\n");
                System.out.printf("Posição no vetor:"+i+"\n");
                System.in.read();
            }
        }
        
    }
    
    public static void PesquisarLivro() throws IOException{
        System.out.println("-----PESQUISA DE LIVRO(CÓDIGO)-----");
        System.out.println("Informe o código do livro: ");
        int codigo = input.nextInt();
        
        System.out.println("-----RESULTADO-----");
        for (int i = 0; i < qtdLivro; i++) {
            if(livro[i].getCodigo() == codigo){
                System.out.printf("CPF:"+livro[i].getTitulo()+"\n");
                System.out.printf("Autor(a):"+livro[i].getAutor()+"\n");
                System.out.printf("Ano:"+livro[i].getAno()+"\n");
                System.out.printf("Edição:"+livro[i].getEdicao()+"\n");
                System.out.printf("Editora:"+livro[i].getEditora()+"\n");
                System.out.printf("ISBN:"+livro[i].getISBN()+"\n");
                System.out.printf("Posição no vetor:"+i+"\n");
                System.in.read();
            }
        }
    }
    
    public static void RealizarEmprestimo(){
        System.out.println("-----REALIZAR EMPRÉSTIMO-----");
        
        for (int i = 0; i < 10; i++) {
            if(emprestimo[i]!= null){
                System.out.println("Data de emprestimo:");
                System.out.printf("Data previsão de entrega: ");

            }
        }
        
    }
    
    public static void RealizarDevolucao(){
        
    }
    
    public static void Relatorio(int escolha){
        switch (escolha){
            case 1:
                System.out.println("-----LISTAGEM DE ALUNOS CADASTRADOS-----");
                for (int i = 0; i <= qtdUsuario; i++) {
                    System.out.printf("\nREGISTRO "+(i+1)+":\n");
                    System.out.printf("Matrícula: "+usuario[i].getMatricula());
                    System.out.printf("CPF: "+usuario[i].getCpf());
                    System.out.printf("Nome: "+usuario[i].getNome());
                    System.out.printf("Telefone: "+usuario[i].getTelefone());
                }
                break;
            case 2:
                System.out.println("-----LISTAGEM DE LIVROS CADASTRADOS-----");
                for (int i = 0; i < qtdLivro; i++) {
                    System.out.printf("\nREGISTRO "+(i+1)+":\n");
                    System.out.println("Código: "+livro[i].getCodigo());
                    System.out.println("Título: "+livro[i].getTitulo());
                    System.out.println("Autor(a): "+livro[i].getAutor());
                    System.out.println("Edição: "+livro[i].getEdicao());
                    System.out.println("Ano: "+livro[i].getAno());
                }
                break;
            case 3:
                System.out.println("-----LISTAGEM DE LIVROS EMPRESTADOS-----");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
    
}