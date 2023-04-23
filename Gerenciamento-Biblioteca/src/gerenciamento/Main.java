package gerenciamento;

import gerenciamento.Emprestimo;
import gerenciamento.Livro;
import gerenciamento.Usuario;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Usuario> usuarios = new ArrayList();
    static ArrayList<Livro> livros = new ArrayList<Livro>();
    static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    
    static Scanner input = new Scanner (System.in);
    
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
                    CadastrarAlunos();
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
    
    public static void CadastrarAlunos(){
        System.out.println("-----CADASTRO DE ALUNO-----");
        
            System.out.println("Informe o CPF:");
            input.nextLine();
            long cpf = input.nextLong();
            
            System.out.println("Informe o nome:");
            input.nextLine();
            String nome = input.next();
            
            System.out.println("Informe o matrícula:");
            input.nextLine();
            int matricula = input.nextInt();
            
            System.out.println("Informe o Telefone:");
            input.nextLine();
            String telefone = input.next();
            
            
        usuarios.add(new Usuario(cpf, nome, matricula, telefone));
    }
    
    public static void CadastrarLivro(){
    
        System.out.println("-----CADASTRO DE LIVRO-----");
        
            System.out.println("Informe o codigo:");
            int codigo = input.nextInt();
            System.out.println("Informe o ano:");
            int ano = input.nextInt();
            System.out.println("Informe a edição:");
            int edicao = input.nextInt();
            System.out.println("Informe o título:");
            String titulo = input.next();
            System.out.println("Informe o autor:");
            String autor = input.next();
            System.out.println("Informe a editora:");
            String editora = input.next();
            System.out.println("Informe o ISBN:");
            String isbn = input.next();
            
        livros.add(new Livro(codigo, ano, edicao, titulo, autor, editora, isbn));
        
    }
    
    public static void EditarAluno(){
        
        long matricula = 0;
        int escolha = 0;
        
        if(usuarios.isEmpty()) { // ArrayList sem alunos cadastrados
            System.out.println("Sem alunos cadastrados!");
        } else {
            System.out.println("Matricula do aluno: "); //Chave primária de um registro qualquer
            matricula = input.nextLong();
            
            System.out.println("-----EDITAR ALUNOS-----");
                
                System.out.println("1 - Editar CPF");
                System.out.println("2 - Editar nome");
                System.out.println("3 - Editar matricula");
                System.out.println("4 - Editar telefone");
                escolha = input.nextInt();
        }
        
        int posicao = usuarios.indexOf(matricula); // Descobrindo o indice dentro do ArrayList
        
        switch(escolha){
            case 1 -> {
                System.out.printf("Registro antigo: "+usuarios.get(posicao).getCpf()+"\n");
                System.out.println("Novo registro: ");
                long novoCpf = input.nextLong();
                usuarios.get(posicao).setCpf(novoCpf);
            }
            case 2 -> {
                System.out.printf("Registro antigo: "+usuarios.get(posicao).getNome()+"\n");
                System.out.println("Novo registro: ");
                String novoNome = input.next();
                usuarios.get(posicao).setNome(novoNome);
            }
            case 3 -> {
                System.out.printf("Registro antigo: "+usuarios.get(posicao).getMatricula()+"\n");
                System.out.println("Novo registro: ");
                int novaMatricula = input.nextInt();
                usuarios.get(posicao).setMatricula(novaMatricula);
            }
            case 4 -> {
                System.out.printf("Registro antigo: "+usuarios.get(posicao).getTelefone()+"\n");
                System.out.println("Novo registro: ");
                String telefone = input.next();
                usuarios.get(posicao).setTelefone(telefone);
            }
            default -> System.out.println("Opção inválida!");
        }
    }
    
    public static void EditarLivro(){
        
        int codigo = 0;
        int escolha = 0;
        
        if(livros.isEmpty()){
            System.out.println("Sem livros cadastrados!");
        } else {
            System.out.println("Codigo do livro:");
            codigo = input.nextInt();
            
            System.out.println("-----EDITAR LIVROS-----");
            
                System.out.println("1 - Editar código");
                System.out.println("2 - Editar ano");
                System.out.println("3 - Editar edição");
                System.out.println("4 - Editar título");
                System.out.println("5 - Editar autor(a)");
                System.out.println("6 - Editar editora");
                System.out.println("7 - Editar ISBN");
                escolha = input.nextInt();
        }
        
        int posicao = livros.indexOf(codigo);
        
        switch(escolha){
            case 1 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getCodigo());
                System.out.println("Novo registro: ");
                int novoCodigo = input.nextInt();
                livros.get(codigo).setCodigo(novoCodigo);
            }
            case 2 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getAno());
                System.out.println("Novo registro: ");
                int ano = input.nextInt();
                livros.get(posicao).setAno(ano);
            }
            case 3 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getEdicao());
                System.out.println("Novo registro:");
                int edicao = input.nextInt();
                livros.get(posicao).setEdicao(edicao);
            }
            case 4 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getTitulo());
                System.out.println("Novo registro: ");
                String titulo = input.next();
                livros.get(posicao).setTitulo(titulo);
            }
            case 5 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getAutor());
                System.out.println("Novo registro: ");
                String autor = input.next();
                livros.get(posicao).setAutor(autor);
            }
            case 6 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getEditora());
                System.out.println("Novo registro: ");
                String editora = input.next();
                livros.get(posicao).setEditora(editora);
            }
            case 7 -> {
                System.out.println("Registro antigo: "+livros.get(posicao).getISBN());
                System.out.println("Novo registro: ");
                String isbn = input.next();
                livros.get(posicao).setISBN(isbn);
            }
            default -> System.out.println("Opção inválida!");
            
        }
       
    }
    
    public static void PesquisarAluno() throws IOException{
        
        int matricula =0;
        
        System.out.println("-----PESQUISAR ALUNO-----");
        
        if(usuarios.isEmpty()){
            System.out.println("Sem alunos cadastrados!");
        }else{
            System.out.println("Informe a matrícula do aluno: ");
            matricula = input.nextInt();
        }
        
        int posicao = usuarios.indexOf(matricula);
        
        System.out.printf("CPF......: "+usuarios.get(posicao).getCpf()+"\n");
        System.out.printf("Nome.....: "+usuarios.get(posicao).getNome()+"\n");
        System.out.printf("Matrícula: "+usuarios.get(posicao).getMatricula()+"\n");
        System.out.printf("Telefone.: "+usuarios.get(posicao).getTelefone()+"\n\n");
    }
    
    public static void PesquisarLivro() throws IOException{
        
        int codigo = 0;
        
        System.out.println("-----PESQUISAR LIVRO-----");
        
        if(livros.isEmpty()){
            System.out.println("Sem livros cadastrados!");
        }else{
            System.out.println("Informe o código do livro: ");
            codigo = input.nextInt();
        }
        
        int posicao = livros.indexOf(codigo);
        
        System.out.printf("Codigo..: "+livros.get(posicao).getCodigo()+"\n");
        System.out.printf("Ano.....: "+livros.get(posicao).getAno()+"\n");
        System.out.printf("Edição..: "+livros.get(posicao).getEdicao()+"\n");
        System.out.printf("Título..: "+livros.get(posicao).getTitulo()+"\n");
        System.out.printf("Autor(a): "+livros.get(posicao).getAutor()+"\n");
        System.out.printf("Editora.: "+livros.get(posicao).getEditora()+"\n");
        System.out.printf("ISBN....: "+livros.get(posicao).getISBN()+"\n\n");
        
    }
    
    public static void RealizarEmprestimo(){
        int dia = 0;
        int mes = 0;
        int ano = 0;
        int posicaoLivro = 0;
        int posicaoAluno = 0;
        
        System.out.println("-----EMPRÉSTIMO DE LIVROS-----");
        
        System.out.println("Data de empréstimo: ");
            System.out.println("Dia:");
            dia = input.nextInt();
            System.out.println("Mês:");
            mes = input.nextInt();
            System.out.println("Ano:");
            ano = input.nextInt();
        emprestimos.get(usuarios.size()).setDataDeEmprestimo(LocalDate.MIN);
        
            
        System.out.println("Matrícula do aluno: ");
        int matricula = input.nextInt();
        System.out.println("Código do livro: ");
        int codigo = input.nextInt();
        
        posicaoAluno = usuarios.indexOf(matricula);
        if(posicaoAluno < 0){
            System.out.println("Aluno não encontrado!");
        }else{
            emprestimos.get(usuarios.size()).setUsuario(usuarios.get(posicaoAluno));
        }
        
        posicaoLivro = livros.indexOf(codigo);
        if(posicaoLivro < 0){
            System.out.println("Livro não encotrado!");
        }else{
            emprestimos.get(usuarios.size()).setLivro(livros.get(posicaoLivro));
        }

    }
    
    public static void RealizarDevolucao(){
        
        int codigo = 0;
        int matricula = 0;
        
        System.out.println("-----DEVOLUÇÃO DE LIVROS-----");
        
        System.out.println("Codigo livro emprestado: ");
        codigo = input.nextInt();
        System.out.println("Matricula aluno responsável: ");
        matricula = input.nextInt(); 
        
    }
    
    public static void Relatorio(int escolha){
    
        
        switch(escolha){
            case 1 ->{ //Listagem de alunos
                
                if(usuarios.isEmpty()){
                    System.out.println("Sem alunos cadastrados!");
                } else{
                    System.out.println("-----LISTAGEM DE ALUNOS-----");
                    for(Usuario aluno: usuarios){
                        System.out.printf("CPF......: "+aluno.getCpf()+"\n");
                        System.out.printf("Nome.....: "+aluno.getNome()+"\n");
                        System.out.printf("Matrícula: "+aluno.getMatricula()+"\n");
                        System.out.printf("Telefone.: "+aluno.getTelefone()+"\n\n");
                    }   
                }
                
            }
            case 2 ->{ // Listagem de livros
                
                if(livros.isEmpty()){
                    System.out.println("Sem livros cadastrados!");
                }else {
                    System.out.println("-----LISTAGEM DE LIVROS-----");
                    for(Livro livro: livros){
                        System.out.printf("Codigo..: "+livro.getCodigo()+"\n");
                        System.out.printf("Ano.....: "+livro.getAno()+"\n");
                        System.out.printf("Edição..: "+livro.getEdicao()+"\n");
                        System.out.printf("Título..: "+livro.getTitulo()+"\n");
                        System.out.printf("Autor(a): "+livro.getAutor()+"\n");
                        System.out.printf("Editora.: "+livro.getEditora()+"\n");
                        System.out.printf("ISBN....: "+livro.getISBN()+"\n\n");
                    }
                }
                
            }
            case 3 ->{ // Listagem de empréstimos
                
                if(emprestimos.isEmpty()){
                    System.out.println("Sem empréstimos realizados!");
                }else{
                    System.out.println("-----LISTAGEM DE EMPRÉSTIMOS-----");
                    for(Emprestimo emprestado: emprestimos){
                        System.out.printf("Data de empéstimo....: "+emprestado.getDataDeEmprestimo()+"\n");
                        System.out.printf("Previsão de devolução: "+emprestado.getDataPrevistaDeDevolucao()+"\n");
                        System.out.printf("Data de devolução....: "+emprestado.getDataDeEntregaReal()+"\n");
                        System.out.printf("Aluno responsável....: "+emprestado.getUsuario()+"\n");
                        System.out.printf("Livro emprestado.....: "+emprestado.getLivro()+"\n\n");
                    }
                }
                
            }
            default -> System.out.println("Opção inválida!");
        }
        
    }
    
}