package modelo;


public class Endereco implements IExibirInformacoes{
    private String cidade;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public Endereco(String cidade, String rua, String numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
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
    public String getInformacoes() {
        return rua + ", " + numero + " - " + cidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
    
    
}
