package controle;

import java.util.ArrayList;
import modelo.MedicamentoControlado;
import modelo.Produto;
import util.Input;

public class CadastroProduto {
    public static ArrayList<Produto> Produtos = new ArrayList<>();
    
    public static void setarDados(Produto novo_produto){
        System.out.println("CODIGO............:");
        novo_produto.setCodigo(Input.nextInt());
        System.out.println("DESCRICAO.........:");
        novo_produto.setDescricao(Input.nextLine());
        /*System.out.println("MARCA.............:");
        novo_produto.setMarca(Input.nextLine());*/
       /* System.out.println("LOTE..............:");
        novo_produto.setLote(Input.nextLine());
        System.out.println("DATA DE FABRICACAO:");
        novo_produto.setDataFabricacao(Input.nextLocalDate());
        System.out.println("DATA DE VENCIMENTO:");
        novo_produto.setDataVencimento(Input.nextLocalDate());
        System.out.println("CODIGO DE BARRAS..:");
        novo_produto.setCodigoBarras(Input.nextLine());
        System.out.println("VALOR (R$)........:");
        novo_produto.setValor(Input.nextDouble());*/
    }
    
    public static void cadastrarProduto(){
        Produto novo_produto = new Produto();
        setarDados(novo_produto);
        Produtos.add(novo_produto);
        System.out.println("\nCADASTRO DE PRODUTO REALIZADO!");
    }
    
    
}
