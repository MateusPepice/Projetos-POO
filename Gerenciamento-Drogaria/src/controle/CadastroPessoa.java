
package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    
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
        
        funcionarios.add(novo_funcionario);
        System.out.println("\nCADASTRO DE NOVO FUNCIONARIO REALIZADO!!");
    }
    
    public static void cadastroCliente(){
        Cliente novo_cliente = new Cliente();
        setarDados(novo_cliente);
        
        System.out.println("EMAIL...:");
        novo_cliente.setEmail(Input.nextLine());
        
        clientes.add(novo_cliente);
        System.out.println("\nCADASTRO DE NOVO CLIENTE REALIZADO!!");
    }
    
    public static void pesquisarCodFuncionario(int cod){
        
    }
    
    public static void listarPessoas(int escolha){
        switch (escolha) {
            case 1 -> {
                if (funcionarios.isEmpty()){
                    System.out.println("\nNENHUM REGISTRADO ENCONTRADO!");
                    return;
                } 

                for (Funcionario listaFuncionarios : funcionarios) {
                    System.out.println(listaFuncionarios);
                }
            }
            case 2 -> {
                if(clientes.isEmpty()){
                    System.out.println("\nNENHUM REGISTRADO ENCONTRADO!");
                    return;
                }

                for (Cliente listaClientes : clientes) {
                    System.out.println(listaClientes);
                }
            }
        }
  
    }
}