package controle;

import java.util.ArrayList;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import util.Input;

public class CadastroProduto {
    public static ArrayList<MedicamentoControlado> medicamentosControlados = new ArrayList<>();
    public static ArrayList<MedicamentoInjetavel> medicamentosInjetaveis = new ArrayList<>();
    
    public static Medicamento setarDados(Medicamento novo_produto){
        
        System.out.println("CODIGO............:");
        novo_produto.setCodigo(Input.nextInt());
        System.out.println("DESCRICAO.........:");
        novo_produto.setDescricao(Input.nextLine());
        System.out.println("MARCA.............:");
        novo_produto.setMarca(Input.nextLine());
        System.out.println("LOTE..............:");
        novo_produto.setLote(Input.nextLine());
        System.out.println("DATA DE FABRICACAO:");
        novo_produto.setDataFabricacao(Input.nextLocalDate());
        System.out.println("DATA DE VENCIMENTO:");
        novo_produto.setDataVencimento(Input.nextLocalDate());
        System.out.println("CODIGO DE BARRAS..:");
        novo_produto.setCodigoBarras(Input.nextLine());
        System.out.println("VALOR (R$)........:");
        novo_produto.setValor(Input.nextDouble());

        return novo_produto;
    }

    public static void cadastroMedicamentoInjetavel(){
       MedicamentoInjetavel novo_medicamento = new MedicamentoInjetavel();
       setarDados(novo_medicamento);
       medicamentosInjetaveis.add(novo_medicamento);
       System.out.println("\nCADASTRO DE MEDICAMENTO INJETAVEL REALIZADO!");
    }
    
    public static void cadastroMedicamentoControlado(){
       MedicamentoControlado novo_medicamento = new MedicamentoControlado(); 
        setarDados(novo_medicamento);
        medicamentosControlados.add(novo_medicamento);
        System.out.println("\nCADASTRO DE MEDICAMENTO CONTROLADO REALIZADO!");
    }
    
    public static void listarProdutos(int tipo){
        switch(tipo){
            case 1 -> {
                for (MedicamentoControlado listaMedicamentosControlado : medicamentosControlados) {
                    System.out.println(listaMedicamentosControlado);
                }
            }
            case 2 -> {
                for (MedicamentoInjetavel listarMedicamentosInjetaveis : medicamentosInjetaveis) {
                    System.out.println(listarMedicamentosInjetaveis);
                }
            }
            default -> System.out.println("\nOPCAO INVALIDA!");
        }
    }
}
