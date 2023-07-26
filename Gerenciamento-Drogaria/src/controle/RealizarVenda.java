package controle;

import java.util.ArrayList;
import java.util.Random;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.ItemVenda;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import modelo.Produto;
import modelo.Venda;
import util.Input;

public class RealizarVenda {
    public static ArrayList<Venda> vendas = new ArrayList<>();
    public static boolean vendaRealizada;
    
    public static boolean setarDados(Venda nova_venda){
        Random aleatorio = new Random();
        nova_venda.setCodigo(aleatorio.nextInt(100));
        
        System.out.println("CODIGO DO FUNCIONARIO:");
        Funcionario funcionario = (Funcionario) CadastroPessoa.pesquisarCod(Input.nextInt());
        if(funcionario == null) return false;
        nova_venda.setFuncionario(funcionario);
        
        System.out.println("CODIGO DO CLIENTE:");
        Cliente cliente = (Cliente) CadastroPessoa.pesquisarCod(Input.nextInt());
        if(cliente == null) return false;
        nova_venda.setCliente(cliente);
        
        System.out.println("DATA:");
        nova_venda.setData(Input.nextLocalDate());
        
        ArrayList<ItemVenda> itens = new ArrayList<>();
        carrinho(itens);
        nova_venda.setListaProdutos(itens);
        
        nova_venda.setValorProduto();
        
        if(itens.get(0).getProduto() instanceof MedicamentoControlado){
            nova_venda.desconto((MedicamentoControlado)(itens.get(0).getProduto()));
        } else if (itens.get(0).getProduto() instanceof MedicamentoInjetavel) {
            nova_venda.desconto((MedicamentoInjetavel)(itens.get(0).getProduto()));
        } else if (itens.get(0).getProduto() instanceof Medicamento) {
            nova_venda.desconto((Medicamento)(itens.get(0).getProduto()));
        } else if (itens.get(0).getProduto() instanceof Produto) {
            nova_venda.desconto((Produto)(itens.get(0).getProduto()));
        }
        
        nova_venda.setValorTotal();
        
        return !itens.isEmpty();
    }
    
    public static void novaVenda(){
        Venda nova_venda = new Venda();
        vendaRealizada = setarDados(nova_venda);  
        if(vendaRealizada){
            vendas.add(nova_venda);
            System.out.println("\nVENDA REALIZADA COM SUCESSO!");
            return;
        }
        System.out.println("\nVENDA NAO REALIZADA!");
        
    }
    
    public static void carrinho(ArrayList<ItemVenda> itens){
        int codigo;
        
        do{  
            System.out.println("\n0 - SAIR DO CARRINHO");
            System.out.println("CODIGO DO PRODUTO:");
            codigo = Input.nextInt();
            if(codigo == 0) return;
            

            Produto item = CadastroProduto.pesquisarCod(codigo);
            if(item != null){
                ItemVenda novoItem = new ItemVenda();
                novoItem.setProduto(item);
                System.out.println("QUANTIDADE:");
                novoItem.setQuantidade(Input.nextInt());
                itens.add(novoItem);
            }

        }while (codigo != 0);
                
        return;
    }
    
    public static Venda pesquisarVenda(int cod){
        if(vendas.isEmpty()){
            System.out.println("\nNAO HA VENDAS REALIZADAS!");
            return null;
        }
        
        for (Venda venda : vendas) {
            if(venda.getCodigo() == cod){
                System.out.println("\nVENDA ENCONTRADA!");
                return venda;
            }
        }
        System.out.println("\nVENDA NAO ENCONTRADA!");
        return null;
    }
    
    public static void listarVendas(){
        
        if(vendas.isEmpty()){
            System.out.println("\nNAO HA VENDAS REALIZADAS!");
            return;
        }
        
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
            
    }
    
    public static void exibirDetalhes(){
        int num = 0;
        System.out.println("CODIGO DA VENDA:");
        int codigo = Input.nextInt();
        Venda vendaEncontrada = pesquisarVenda(codigo);
        if(vendaEncontrada == null) return;
        
        System.out.printf("\n--------------------------------------------");
        System.out.printf("--------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println(vendaEncontrada);
        System.out.printf("--------------------------------------------");
        System.out.printf("--------------------------------------------");
        System.out.println("-----------------------------------------------");
        int indice = vendas.indexOf(vendaEncontrada);
        for (ItemVenda venda : vendas.get(indice).getListaProdutos()) {
            num++;
            System.out.printf("ITEM %d: ", num);
            System.out.println(venda);
        }
    }
    
}