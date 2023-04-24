package gerenciamento;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Livro> livros = new ArrayList<>();
    static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
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
                case 1 -> CadastrarAlunos();
                case 2 -> EditarAluno();
                case 3 -> CadastrarLivro();
                case 4 -> EditarLivro();
                case 5 -> {
                    System.out.println("-----PESQUISAR ALUNO-----");
                    System.out.println("Informe a matrícula do aluno: ");
                    int matricula = input.nextInt();
                 
                    Usuario usuario = PesquisarAluno(matricula);
                    System.out.println("----------------------");
                    System.out.printf("Nome.....: "+usuario.getNome()+"\n");
                    System.out.printf("Matrícula: "+usuario.getMatricula()+"\n");
                    System.out.printf("CPF......: "+usuario.getCpf()+"\n");
                    System.out.printf("Telefone.: "+usuario.getTelefone()+"\n");
                    
                }   
                case 6 -> {
                    System.out.println("-----PESQUISAR LIVRO-----");
                    System.out.println("Informe o código do livro");
                    int codigo = input.nextInt();
                    
                    Livro livro = PesquisarLivro(codigo);
                    System.out.println("----------------------");
                    System.out.printf("Codigo..:"+livro.getCodigo()+"\n");
                    System.out.printf("Ano.....:"+livro.getAno()+"\n");
                    System.out.printf("Edição..:"+livro.getEdicao()+"\n");
                    System.out.printf("Título..:"+livro.getTitulo()+"\n");
                    System.out.printf("Autor(a):"+livro.getAutor()+"\n");
                    System.out.printf("Editora.:"+livro.getEditora()+"\n");
                    System.out.printf("ISBN....:"+livro.getISBN()+"\n");
                    
                }
                case 7 -> RealizarEmprestimo();
                case 8 -> RealizarDevolucao();
                case 9 -> {
                    System.out.println("1 - Listagem de alunos cadastrados");
                    System.out.println("2 - Listagem de livros cadastrados");
                    System.out.println("3 - Listagem de livros emprestados");
                    escolha_9 = input.nextInt();
                    Relatorio(escolha_9);
                }
                case 0 -> System.out.println("Saindo do sistema!");
                default -> {
                    System.out.println("Opção inválida!");
                    System.in.read();
                }
            }
        } while(escolha != 0);
    }
    
    public static void CadastrarAlunos(){
        System.out.println("-----CADASTRO DE ALUNO-----");
        
            System.out.println("Informe o CPF:");
            long cpf = input.nextLong();
            
            System.out.println("Informe o nome:");
            input.nextLine();
            String nome = input.nextLine();
            
            System.out.println("Informe o matrícula:");
            int matricula = input.nextInt();
            
            System.out.println("Informe o Telefone:");
            input.nextLine();
            String telefone = input.nextLine();
            
            
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
            input.nextLine();
            
            System.out.println("Informe o título:");
            String titulo = input.nextLine();
            System.out.println("Informe o autor:");
            String autor = input.nextLine();
            System.out.println("Informe a editora:");
            String editora = input.nextLine();
            System.out.println("Informe o ISBN:");
            String isbn = input.nextLine();
            
        livros.add(new Livro(codigo, ano, edicao, titulo, autor, editora, isbn));
        
    }
    
    public static void EditarAluno(){
        
        int matricula = 0;
        int escolha = 0;
        int i = 0;
        int posicao = 0;
        
        if(usuarios.isEmpty()) { // ArrayList sem alunos cadastrados
            System.out.println("Sem alunos cadastrados!");
            return;
        } else {
            System.out.println("Matricula do aluno: "); //Chave primária de um registro qualquer
            matricula = input.nextInt();
            
            System.out.println("-----EDITAR ALUNOS-----");
                
                System.out.println("1 - Editar CPF");
                System.out.println("2 - Editar nome");
                System.out.println("3 - Editar matricula");
                System.out.println("4 - Editar telefone");
                escolha = input.nextInt();
        }
        
        for(Usuario alunos: usuarios){ // Descobrindo o indice dentro do ArrayList
            i++;
            if(alunos.getMatricula()== matricula){
               posicao = i-1;
            }
        } 

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
        int posicao = 0;
        int i = 0;
        
        if(livros.isEmpty()){
            System.out.println("Sem livros cadastrados!");
            return;
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
        
        for(Livro livro: livros){ // Descobrindo o indice dentro do ArrayList
            i++;
            if(livro.getCodigo() == codigo){
               posicao = i-1;
            }
        } 
        
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
    
    public static Usuario PesquisarAluno(int matricula){
        
        Usuario usuario = new Usuario();

        int i = 0;
        
        if(usuarios.isEmpty()){
            System.out.println("Não há registros de alunos!");
            return usuario;
        }else{
            for(Usuario alunos: usuarios){ // Descobrindo o indice dentro do ArrayList
                i++;
                if(alunos.getMatricula()== matricula){
                   usuario.setCpf(usuarios.get(i-1).getCpf());
                   usuario.setMatricula(usuarios.get(i-1).getMatricula());
                   usuario.setNome(usuarios.get(i-1).getNome());
                   usuario.setTelefone(usuarios.get(i-1).getTelefone());
                }
            } 
        }

        return usuario;
    }
    
    public static Livro PesquisarLivro(int codigoLivro){
        
        Livro livro = new Livro();
        int i =0;
        
        if(livros.isEmpty()){
            System.out.println("não há registros de livros!");
            return livro;
        }else{
            for(Livro livroAuxiliar: livros){ // Descobrindo o indice dentro do ArrayList
                i++;
                if(livroAuxiliar.getCodigo() == codigoLivro){
                    livro.setCodigo(livros.get(i-1).getCodigo());
                    livro.setAno(livros.get(i-1).getAno());
                    livro.setEdicao(livros.get(i-1).getEdicao());
                    livro.setTitulo(livros.get(i-1).getTitulo());
                    livro.setAutor(livros.get(i-1).getAutor());
                    livro.setEditora(livros.get(i-1).getEditora());
                    livro.setISBN(livros.get(i-1).getISBN());
                }
            } 
        }
        
        return livro;
    }
    
    public static void RealizarEmprestimo(){
        
        Emprestimo emprestimo = new Emprestimo();
        
        int matricula = 0;
        int codigoLivro = 0;
        int codigoEmprestimo = 0;
        int i = 0;
        int posicaoLivro = 0;
        int posicaoAluno = 0;
        
        LocalDate hoje = LocalDate.now();
        
        System.out.println("Matrícula do aluno:");
        matricula = input.nextInt();
        System.out.println("Código do livro:");
        codigoLivro = input.nextInt();
        System.out.println("Código do empréstimo: ");
        codigoEmprestimo = input.nextInt();
        
        Livro livro = PesquisarLivro(codigoLivro);
        Usuario usuario = PesquisarAluno(matricula);
        
        emprestimo.setDataDeEmprestimo(hoje);
        emprestimo.setCodigoEmprestimo(codigoEmprestimo);
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        
        emprestimos.add(emprestimo);
    }
    
    public static void RealizarDevolucao(){
        
        int codigo;
        int posicaoEmprestimo = 0;
        int i = 0;
        
        System.out.println("-----DEVOLUÇÃO DE LIVROS-----");
        
        System.out.println("Informe o código do empréstimo: ");
        codigo = input.nextInt();
        
        for(Emprestimo devolucao: emprestimos){
            i++;
            if(devolucao.getCodigoEmprestimo() == codigo){
                posicaoEmprestimo = i-1;
            }
        }
        emprestimos.remove(posicaoEmprestimo);
        
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
                        System.out.printf("Livro emprestado.....: "+emprestado.getLivro()+"\n");
                        System.out.printf("Situação.............: "+emprestado.getSituacao()+"\n");
                        System.out.printf("Código de empréstimo.: "+emprestado.getCodigoEmprestimo()+"\n\n");
                    }
                }
                
            }
            default -> System.out.println("Opção inválida!");
        }
        
    }
    
}