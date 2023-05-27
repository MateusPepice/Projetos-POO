package controle;

import java.util.ArrayList;
import modelo.Cliente;
import util.Input;

public class CadastroCliente {
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static void setarDados(Cliente cliente_qualquer){
        CadastroPessoa.setarDados(cliente_qualquer);
        
        System.out.println("LIMITE DE CREDITO:");
        cliente_qualquer.setLimite_credito(Input.nextDouble());
        
    }
    
    public static void cadastrar(){
        Cliente novo_cliente = new Cliente();
        setarDados(novo_cliente);
        listaClientes.add(novo_cliente);
        System.out.println("\nCadastro realizado!");
    }
    
    public static void listarClientes(){
    
        if(listaClientes == null || listaClientes.isEmpty()){
            System.out.println("\nNAO HA REGISTROS CADASTRADOS!\n");
            return;
        }
        
        for (Cliente listaCliente : listaClientes) {
            System.out.println(listaCliente);
        }
    }
    
}
