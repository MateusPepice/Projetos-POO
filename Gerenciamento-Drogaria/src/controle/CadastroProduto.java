package controle;

import java.util.ArrayList;
import modelo.ItemVenda;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import modelo.Produto;
import util.Input;

public class CadastroProduto {
    public static ArrayList<Produto> produtos = new ArrayList<>();
    
    public static void setarDados(Produto novo_produto){
        System.out.println("CODIGO............:");
        novo_produto.setCodigo(Input.nextInt());
        System.out.println("DESCRICAO.........:");
        novo_produto.setDescricao(Input.nextLine());
       /* System.out.println("MARCA.............:");
        novo_produto.setMarca(Input.nextLine());
        System.out.println("LOTE..............:");
        novo_produto.setLote(Input.nextLine());
        System.out.println("DATA DE FABRICACAO:");
        novo_produto.setDataFabricacao(Input.nextLocalDate());
        System.out.println("DATA DE VENCIMENTO:");
        novo_produto.setDataVencimento(Input.nextLocalDate());
        System.out.println("CODIGO DE BARRAS..:");
        novo_produto.setCodigoBarras(Input.nextLine());*/
        System.out.println("VALOR (R$)........:");
        novo_produto.setValor(Input.nextDouble());
    }
    
    public static void cadastrarProduto(){
        Produto novo_produto = new Produto();
        setarDados(novo_produto);
        produtos.add(novo_produto);
        System.out.println("\nCADASTRO DE PRODUTO REALIZADO!");
    }
    
    public static void listarProdutos(int tipo){
        
        boolean encontrado = true;
        for (Produto lista : produtos) {
            if(lista instanceof MedicamentoControlado && tipo == 1){
                System.out.println(lista);
                encontrado = false;
            } else if((lista instanceof MedicamentoInjetavel) && (tipo == 2)){
                System.out.println(lista);
                encontrado = false;
            } else if (lista instanceof Medicamento && tipo == 3){
                System.out.println(lista);
                encontrado = false;
            } else if (lista instanceof Produto && tipo == 4){
                System.out.println(lista);
                encontrado = false;
            }
        }
        
        if(encontrado){
            System.out.println("\nNENHUM REGISTRO ENCONTRADO!");
        }
    }
    
    public static Produto pesquisarCod(int cod){
        for (Produto produto : produtos) {
            if(produto.getCodigo() == cod){
                return produto;
            }
        }
        System.out.println("\nREGISTRO NAO ENCONTRADO!");
        return null;
    }
}
