package controle;

import java.util.ArrayList;
import modelo.Vendedor;

public class CadastroVendedor {
    public static ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public static void setarDados(Vendedor vendedor_qualquer){
        CadastroFuncionario.setarDados(vendedor_qualquer);
        
        vendedor_qualquer.calculaAcrescimo();
    }
    
    public static void cadastrar(){
        Vendedor novo_vendedor = new Vendedor();
        setarDados(novo_vendedor);
        listaVendedores.add(novo_vendedor);
        System.out.println("\nCadastro realizado!");
    }
    
    public static void listarVendedores(){
    
        if(listaVendedores == null || listaVendedores.isEmpty()){
            System.out.println("\nNAO HA REGISTROS CADASTRADOS!\n");
            return;
        }
        
        for (Vendedor listaVendedor : listaVendedores) {
            System.out.println(listaVendedor);
        }
    }
}
