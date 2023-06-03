
package controle;

import java.util.ArrayList;
import java.util.Random;
import modelo.Venda;

public class RealizarVenda {
    public static ArrayList<Venda> vendas = new ArrayList<>();
    
    public static void setarDados(Venda nova_venda){
        Random aleatorio = new Random();
        nova_venda.setCodigo(aleatorio.nextInt(100));
        
        System.out.println("CODIGO DO FUNCIONARIO:");
        
        System.out.println("CODIGO DO CLIENTE:");
        System.out.println("DATA:");
        System.out.println("VALOR DO PRODUTO:");
        System.out.println("DESCONTO:");
        System.out.println("ITEM:");
    }
}
