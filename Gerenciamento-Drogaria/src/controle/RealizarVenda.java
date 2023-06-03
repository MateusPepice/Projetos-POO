
package controle;

import java.util.ArrayList;
import java.util.Random;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.ItemVenda;
import modelo.Venda;
import util.Input;

public class RealizarVenda {
    public static ArrayList<Venda> vendas = new ArrayList<>();
    
    public static void setarDados(Venda nova_venda){
        Random aleatorio = new Random();
        nova_venda.setCodigo(aleatorio.nextInt(100));
        System.out.println("CODIGO DO FUNCIONARIO:");
        nova_venda.setFuncionario((Funcionario) CadastroPessoa.pesquisarCod(Input.nextInt()));
        System.out.println("CODIGO DO CLIENTE:");
        nova_venda.setCliente((Cliente) CadastroPessoa.pesquisarCod(Input.nextInt()));
        System.out.println("DATA:");
        nova_venda.setData(Input.nextLocalDate());
        System.out.println("VALOR DO PRODUTO:");
        nova_venda.setValorProduto(Input.nextDouble());
        System.out.println("DESCONTO:");
        ArrayList<ItemVenda> itens = new ArrayList<>();
        CadastroProduto.carrinho(itens);
    }
}
