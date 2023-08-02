package aulapoo;
import controle.CadastroAluno;
import controle.CadastroPessoa;
import util.Input;

public class Main {
    static int resposta;
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        do{
            System.out.println("\n-----MENU PRINCIPAL-----\n");
            System.out.println("1 - MENU CADASTRO PESSOA");
            System.out.println("2 - MENU CADASTRO ALUNO");
            System.out.println("0 - SAIR DO SISTEMA");
            resposta = Input.nextInt();
            
            switch(resposta){
                case 1 -> moduloPessoa();
                case 2 -> moduloAluno();
                case 0 -> {}     
                default -> System.out.println("OPCAO INVALIDA!");
            }
        } while (resposta != 0);
        System.out.println("VOCE SAIU DO SISTEMA!");
    }
    
    public static void moduloAluno(){
        do{
            System.out.println("\n-----MENU CADASTRO DE ALUNO-----");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - PESQUISAR ALUNO");
            System.out.println("3 - LISTAR ALUNOS");
            System.out.println("4 - REMOVER ALUNO");
            System.out.println("0 - SAIR DO SISTEMA");
            resposta = Input.nextInt();
            
            switch (resposta){
                case 1 -> cadastrarAluno();
                case 2 -> pesquisarAluno();
                case 3 -> listarAlunos();
                case 4 -> removerAluno();
                case 0 -> menu();
                default -> System.out.println("OPCAO INVALIDA!");
            }
        }while (resposta != 0);
    }
    
    public static void cadastrarAluno(){
        CadastroAluno.cadastrarAluno();
    }
    public static void pesquisarAluno(){
        String dado;
        System.out.println("BUSCAR POR:"
            + " 1 - RA"
            + " 2 - NOME");
        resposta = Input.nextInt();
        
        if(resposta == 1){
            System.out.println("INFORME O RA DA PESSOA:");
            dado = Input.nextLine();
            CadastroAluno.PesquisarAlunoRa(dado);
        } else if (resposta == 2){
            System.out.println("INFORME O NOME DA PESSOA:");
            dado = Input.nextLine();
            CadastroAluno.PesquisarAlunoNome(dado);
        } else {
            System.out.println("OPCAO INVALIDA!");
            pesquisarAluno();
        }
    }
    public static void listarAlunos(){
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        resposta = Input.nextInt();
        CadastroAluno.listarAluno(resposta);
    }
    public static void removerAluno(){
        System.out.println("INFORME O RA: ");
        String ra = Input.nextLine();
        CadastroAluno.RemoverAlunoRa(ra);
    }
    
    public static void moduloPessoa(){
        
        do{
            System.out.println("\n-----MENU CADASTRO DE PESSOA-----");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - PESQUISAR PESSOA");
            System.out.println("3 - LISTAR PESSOAS");
            System.out.println("4 - REMOVER PESSOAS");
            System.out.println("0 - VOLTAR");
            resposta = Input.nextInt();
      
            switch(resposta) {
                case 1 -> cadastrarPessoa();
                case 2 -> pesquisarPessoa();
                case 3 -> listarPessoas();
                case 4 -> removerPessoa();
                case 0 -> menu();
                default -> System.out.println("OPCAO INVALIDA!");
            }
 
        } while (resposta != 0);
       
    }
    
    public static void cadastrarPessoa(){
        CadastroPessoa.CadastrarPessoa();
    }
    
    public static void pesquisarPessoa(){
        String dado;
            System.out.println("BUSCAR POR:"
                + " 1 - CPF"
                + " 2 - NOME");
        resposta = Input.nextInt();
        
        if(resposta == 1){
            System.out.println("INFORME O CPF DA PESSOA:");
            dado = Input.nextLine();
            CadastroPessoa.PesquisarPessoaCpf(dado);
        } else if (resposta == 2){
            System.out.println("INFORME O NOME DA PESSOA:");
            dado = Input.nextLine();
            CadastroPessoa.PesquisarPessoaNome(dado);
        } else{
            System.out.println("OPCAO INVALIDA!");
            pesquisarPessoa();
        }
    }
    
    public static void listarPessoas(){
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        resposta = Input.nextInt();
        CadastroPessoa.Listar(resposta);
    }
    
    public static void removerPessoa(){
        System.out.println("INFORME O CPF: ");
        String cpf = Input.nextLine();
        CadastroPessoa.RemoverPessoaCpf(cpf);
    }
}
