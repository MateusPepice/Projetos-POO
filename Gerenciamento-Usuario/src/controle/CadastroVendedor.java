package controle;

import java.util.ArrayList;
import modelo.Vendedor;

public class CadastroVendedor {
    public static ArrayList<Vendedor> listaVendedores = new ArrayList<>();
    
    
    
    public static void cadastrar(){
        Vendedor novo_vendedor = new Vendedor();
        CadastroFuncionario.setarDados(novo_vendedor);
        listaVendedores.add(novo_vendedor);
    }
}
