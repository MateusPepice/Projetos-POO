package controle;

import static controle.CadastroProduto.produtos;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import modelo.Produto;
import util.Input;

public class CadastroMedicamento {
    
    public static void setarDados(Medicamento novo_produto){
        CadastroProduto.setarDados(novo_produto);
      /*  System.out.println("REGISTRO ANVISA...:");
        novo_produto.setNumRegistroAnvisa(Input.nextInt());
        System.out.println("COMPOSICAO QUIMICA:");
        novo_produto.setComposicao(Input.nextLine());
        System.out.println("DOSAGEM...........:");
        novo_produto.setDosagem(Input.nextDouble());*/
    }

    public static void cadastroMedicamento(){
        Medicamento novo_medicamento = new Medicamento();
        setarDados(novo_medicamento);
        produtos.add(novo_medicamento);
        System.out.println("\nCADASTRO DE MEDICAMENTO REALIZADO!");
    }
    
    public static void cadastroMedicamentoInjetavel(){
       MedicamentoInjetavel novo_medicamento = new MedicamentoInjetavel();
       setarDados(novo_medicamento);
       produtos.add(novo_medicamento);
       System.out.println("\nCADASTRO DE MEDICAMENTO INJETAVEL REALIZADO!");
    }
    
    public static void cadastroMedicamentoControlado(){
        MedicamentoControlado novo_medicamento = new MedicamentoControlado(); 
        setarDados(novo_medicamento);
        produtos.add(novo_medicamento);
        System.out.println("\nCADASTRO DE MEDICAMENTO CONTROLADO REALIZADO!");
    }

}
