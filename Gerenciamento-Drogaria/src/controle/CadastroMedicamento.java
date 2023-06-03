package controle;

import static controle.CadastroProduto.Produtos;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import modelo.Produto;
import util.Input;

public class CadastroMedicamento {
    
    public static void setarDados(Medicamento novo_produto){
        CadastroProduto.setarDados(novo_produto);
       /* System.out.println("REGISTRO ANVISA...:");
        novo_produto.setNumRegistroAnvisa(Input.nextInt());
        System.out.println("COMPOSICAO QUIMICA:");
        novo_produto.setComposicao(Input.nextLine());
        System.out.println("DOSAGEM...........:");
        novo_produto.setDosagem(Input.nextDouble());*/
    }

    public static void cadastroMedicamentoInjetavel(){
       MedicamentoInjetavel novo_medicamento = new MedicamentoInjetavel();
       setarDados(novo_medicamento);

       /* System.out.println("FUNCIONARIO RESPONSAVEL....:");
        novo_medicamento.setFuncionarioResponsavel(Input.nextLine());
        System.out.println("CPF DO PACIENTE RESPONSAVEL:");
        novo_medicamento.setCpfPaciente(Input.nextLine());*/
       
       Produtos.add(novo_medicamento);
       System.out.println("\nCADASTRO DE MEDICAMENTO INJETAVEL REALIZADO!");
    }
    
    public static void cadastroMedicamentoControlado(){
        MedicamentoControlado novo_medicamento = new MedicamentoControlado(); 
        setarDados(novo_medicamento);
        
        /*System.out.println("CRM DO MEDICO RESPONSAVEL:");
        novo_medicamento.setCrmMedico(Input.nextLine());
        System.out.println("CPF DO PACIENTE RESPONSAVEL:");
        novo_medicamento.setCpfPaciente(Input.nextLine());*/
        
        Produtos.add(novo_medicamento);
        System.out.println("\nCADASTRO DE MEDICAMENTO CONTROLADO REALIZADO!");
    }
    
    public static void listarProdutos(int tipo){
        
        boolean encontrado = true;
        for (Produto lista : Produtos) {
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
    
    
}
