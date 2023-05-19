package controle;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    
    public static void setarDados(Pessoa pessoa){
        System.out.println("CPF........:");
        pessoa.setCpf(Input.nextLine());
        System.out.println("Nome.......:");
        pessoa.setNome(Input.nextLine());
        System.out.println("Idade......:");
        pessoa.setIdade(Input.nextInt());
        System.out.println("Profissão..:");
        pessoa.setProfissao(Input.nextLine());
        System.out.println("Remuneração:");
        pessoa.setRemuneracao(Input.nextDouble());
    }
       
    public static void cadastrar(){
        Pessoa pessoa = new Pessoa();
        setarDados(pessoa);
        listaPessoas.add(pessoa);
        System.out.println("\nCadastro realizado!");
    }
    
    // Método utilizável em diversos outros métodos
    public static Pessoa pesquisarPessoa(){
        System.out.println("Informe o CPF:");
        String cpf = Input.nextLine();
        
        for (Pessoa listaPessoa : listaPessoas) {
            if(listaPessoa.getCpf().equals(cpf)){
                return listaPessoa;
            }
        }
        
        System.out.println("\nPessoa não encontrada!");
        return null;
    }
    
    // Chama o método PesquisaExistencia
    public static void remover(){
        Pessoa pessoa = pesquisarPessoa();
        boolean pessoa_com_conta = CadastroClientes.pesquisarExistencia(pessoa);
        
        if(pessoa_com_conta){
            System.out.println("\nNão foi possível excluir esta pessoa!");
            System.out.println("\nEsta pessoa tem uma conta.");
            return;
        }
        
        if(pessoa == null){
            System.out.println("\nCadastrado não encontrado!");
        }
        listaPessoas.remove(pessoa);
    }
    
    public static void editarPessoa(){
        Pessoa pessoa = pesquisarPessoa();
        if(pessoa == null){
            return;
        }
        setarDados(pessoa);
        listaPessoas.add(listaPessoas.indexOf(pessoa), pessoa);
    }
    
    public static void listarClientes(){
        if(listaPessoas == null || listaPessoas.isEmpty()){
            System.out.println("\nNão há registros cadastrados!");
            return;
        }
        
        for (Pessoa listaPessoa : listaPessoas) {
            System.out.println(listaPessoa);
        }
    }
}
