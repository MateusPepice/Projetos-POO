package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {

    private int codigo;
    private Funcionario funcionario;
    private Cliente cliente;
    private LocalDate data;
    private double valorProduto;
    private double desconto;
    private double valorTotal;
    private ArrayList<ItemVenda> listaProdutos = new ArrayList<>();

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

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
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

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ItemVenda> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ItemVenda> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}
