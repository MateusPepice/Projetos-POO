package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {

    private int codigo;
    private Funcionario funcionario;
    private Cliente cliente;
    private LocalDate data;
    private ArrayList<ItemVenda> listaProdutos = new ArrayList<>();
    private double valorProduto;
    private double desconto;
    private double valorTotal;


    public Venda() {
        this.funcionario = new Funcionario();
        this.cliente = new Cliente();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto() {
        for (ItemVenda listaProduto : listaProdutos) {
            this.valorProduto = listaProduto.getValorTotal() + this.valorTotal;
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        for (ItemVenda listaProduto : listaProdutos) {
            this.valorTotal = listaProduto.getValorTotal() + this.valorTotal;
        }
        if(getDesconto() == 0) return;

        this.valorTotal = this.valorTotal - (this.valorTotal * getDesconto());
    }

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public String toString() {
        return "Venda{" + "CODIGO: " + codigo + 
                ", CLIENTE: " + cliente.getNome() + 
                ", DATA: " + data + 
                ", QTDE. PRODUTOS: " + listaProdutos.size() + 
                ", VALOR DOS PRODUTOS: " + valorProduto + 
                ", DESCONTO: " + desconto + 
                ", VALOR REAL DA COMPRA: " + valorTotal + '}';
    }

    public void desconto(Produto produto){
        setDesconto(0.05);
    }
    
    public void desconto(Medicamento medicamento){
        setDesconto(0.1);
    }
    
    public void desconto(MedicamentoControlado medicamentoControlado){
        setDesconto(0.03);
    }
    
    public void desconto(MedicamentoInjetavel medicamentoInjetavel){
        setDesconto(0);
    }
    
}
