package controle;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Pessoa;
import util.Input;


public class CadastroPessoa {
    public static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    
    public static void setarDados(Pessoa pessoa_qualquer){
        System.out.println("NOME....:");
        pessoa_qualquer.setNome(Input.nextLine());
        System.out.println("EMAIL...:");
        pessoa_qualquer.setEmail(Input.nextLine());
        System.out.println("TELEFONE:");
        pessoa_qualquer.setTelefone(Input.nextLine());
        System.out.println("IDADE...:");
        pessoa_qualquer.setIdade(Input.nextInt());
        System.out.println("GÊNERO..:");
        pessoa_qualquer.setGenero(input.next().charAt(0));
    }
    
    public static void cadastrar(){
        Pessoa pessoa = new Pessoa();
        setarDados(pessoa);
        listaPessoas.add(pessoa);
    }
    
    public static void excluir(){
        Pessoa pessoa = pesquisar();
        
        if(pessoa == null){
            System.out.println("\nSaindo do método...");
            return;
        }
        
        listaPessoas.remove(pessoa);
        System.out.println("\nCadastro excluido.");
    }
    
    
    public static Pessoa pesquisar(){
        System.out.println("Informe o nome da pessoa que deseja excluir:");
        String nome = Input.nextLine();
        
        for (Pessoa listaPessoa : listaPessoas) {
            if(listaPessoa.getNome().equals(nome)){
                return listaPessoa;
            }
        }
        
        System.out.println("\nRegistro não encontrado!");
        return null;
    }
    
    public static void listarCadastrados(){
        if(listaPessoas == null || listaPessoas.isEmpty()){
            System.out.println("\nNão há registros de pessoas cadastradas!");
            return;
        }

        for (Pessoa listaPessoa : listaPessoas) {
            System.out.println(listaPessoa);
        }
    }
    
    public static void editar(){
        Pessoa novo_pessoa = pesquisar();
        
        if(novo_pessoa == null){
            return;
        }
        
        setarDados(novo_pessoa);
        listaPessoas.add(listaPessoas.indexOf(novo_pessoa), novo_pessoa);
        listaPessoas.remove(novo_pessoa);
        
    }
}