package aulapoo;
import controle.CadastroPessoa;
import util.Input;

public class Main {
    static int resposta;
    
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        
        do{
            System.out.println("\n-----MENU PRINCIPAL-----");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - PESQUISAR PESSOA");
            System.out.println("3 - LISTAR PESSOAS");
            System.out.println("4 - REMOVER PESSOAS");
            System.out.println("0 - SAIR DO SISTEMA");
            resposta = Input.nextInt();
      
            switch(resposta) {
                case 1 -> moduloPessoa();
                case 2 -> moduloPesquisa();
                case 3 -> moduloLista();
                case 4 -> moduloRemover();
                default -> moduloPessoa();
            }
 
        } while (resposta != 0);
        
        System.out.println("VOCE SAIU DO SISTEMA!");
    }
    
    public static void moduloPessoa(){
        CadastroPessoa.CadastrarPessoa();
    }
    
    public static void moduloPesquisa(){
        String dado;
            System.out.println("BUSCAR POR:"
                + " 1 - CPF"
                + " 2 - NOME");
        resposta = Input.nextInt();
        
        if(resposta == 1){
            System.out.println("INFORME O CPF DA PESSOA:");
            dado = Input.nextLine();
            CadastroPessoa.PesquisarPessoaCpf(dado);
        } else{
            System.out.println("INFORME O NOME DA PESSOA:");
            dado = Input.nextLine();
            CadastroPessoa.PesquisarPessoaNome(dado);
        } 
    }
    
    public static void moduloLista(){
        System.out.println("1 - ORDEM CRESCENTE");
        System.out.println("2 - ORDEM DECRESCENTE");
        resposta = Input.nextInt();
        CadastroPessoa.Listar(resposta);
    }
    
    public static void moduloRemover(){
        System.out.println("INFORME O CPF: ");
        String cpf = Input.nextLine();
        CadastroPessoa.RemoverPessoaCpf(cpf);
    }
}
