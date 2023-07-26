
package modelo;

public class ItemVenda {
    private Produto produto;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;

    public ItemVenda() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        setValorUnitario();
        setValorTotal();
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario() {
        this.valorUnitario = getProduto().getValor();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {    
        this.valorTotal = (getQuantidade() * getValorUnitario());
    }

    @Override
    public String toString() {
        return "DESCRICAO: " + produto.getDescricao() + 
                ", QUANTIDADE: " + quantidade + 
                ", VLR. UNITARIO: R$ " + valorUnitario + 
                ", VLR. TOTAL: R$ " + valorTotal + '}';
    }
    
}
