
package modelo;

public class Endereco implements IExibirInformacao{
    private String cidade;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return " CIDADE: " + cidade + " RUA: " + rua + " NUMERO: " + numero;
    }

    @Override
    public String getInformacoes() {
       return "uau";
    }
    
    @Override
    public void exibirInformacoes() {
       getInformacoes();
    }
    
    
}