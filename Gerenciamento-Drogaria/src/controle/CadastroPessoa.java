
package controle;

import java.util.ArrayList;
import java.util.Random;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public static void setarDados(Pessoa nova_pessoa){
        Random aleatorio = new Random();
        nova_pessoa.setCodigo(aleatorio.nextInt(100));
        
        System.out.println("NOME....:");
        nova_pessoa.setNome(Input.nextLine());
        System.out.println("CPF.....:");
        nova_pessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        nova_pessoa.setDataNascimento(Input.nextLocalDate());
        
    }
    
    public static void cadastroFuncionario(){
        Funcionario novo_funcionario = new Funcionario();
        setarDados(novo_funcionario);
        
        System.out.println("CTPS....:");
        novo_funcionario.setCtps(Input.nextLine());
        
        pessoas.add(novo_funcionario);
        System.out.println("\nCADASTRO DE NOVO FUNCIONARIO REALIZADO!!");
    }
    
    public static void cadastroCliente(){
        Cliente novo_cliente = new Cliente();
        setarDados(novo_cliente);
        
        System.out.println("EMAIL...:");
        novo_cliente.setEmail(Input.nextLine());
        
        pessoas.add(novo_cliente);
        System.out.println("\nCADASTRO DE NOVO CLIENTE REALIZADO!!");
    }
    
    public static Pessoa pesquisarCod(int cod){
        
        if(pessoas.isEmpty()){
            System.out.println("\nNAO HA REGISTROS CADASTRADOS!");
            return null;
        }

        for (Pessoa pessoa : pessoas) {
            if(pessoa.getCodigo() == cod){
                return pessoa;
            }
        }
        System.out.println("\nREGISTRO NAO ENCONTRADO!");
        return null;
    }
    
    public static void listarPessoas(int escolha){
        boolean encontrado = true;
            
        for (Pessoa lista : pessoas) {
            if((lista instanceof Funcionario) && (escolha == 1)){
                System.out.println(lista);
                encontrado = false;
            } else if((lista instanceof Cliente) && (escolha == 2)){
                System.out.println(lista);
                encontrado = false;
            }
        }
        
        if(encontrado){
            System.out.println("\nNENHUM REGISTRO CADASTRADO!");
        }
  
    }
}