
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
    
    public Pessoa setarDados(Pessoa nova_pessoa){
        Random aleatorio = new Random();
        nova_pessoa.setCodigo(aleatorio.nextInt(100));
        
        System.out.println("NOME....:");
        nova_pessoa.setNome(Input.nextLine());
        System.out.println("CPF.....:");
        nova_pessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        nova_pessoa.setDataNascimento(Input.nextLocalDate());
        
        return nova_pessoa;
    }
    
    public void cadastroFuncionario(){
        Funcionario novo_funcionario = new Funcionario();
        setarDados(novo_funcionario);
        
        System.out.println("CTPS....:");
        novo_funcionario.setCtps(Input.nextLine());
        
        funcionarios.add(novo_funcionario);
        System.out.println("\nCADASTRO DE NOVO FUNCIONARIO REALIZADO!!");
    }
    
    public void cadastroCliente(){
        Cliente novo_cliente = new Cliente();
        setarDados(novo_cliente);
        
        System.out.println("EMAIL...:");
        novo_cliente.setEmail(Input.nextLine());
        
        clientes.add(novo_cliente);
        System.out.println("\nCADASTRO DE NOVO CLIENTE REALIZADO!!");
    }
    
    public void listarCadastros(int escolha){
        switch (escolha) {
            case 1 -> {
                for (Funcionario listaFuncionarios : funcionarios) {
                    System.out.println(listaFuncionarios);
                }
            }
            case 2 -> {
                for (Cliente listaClientes : clientes) {
                    System.out.println(listaClientes);
                }
            }
            default -> System.out.println("OPÇÃO INVALIDA!!");
        }
  
    }
}