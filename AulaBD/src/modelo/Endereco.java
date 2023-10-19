package modelo;

public class Endereco {
    private Integer id_endereco;
    private String cidade;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public Endereco(Integer id_endereco, String cidade, String rua, String numero) {
        this.id_endereco = id_endereco;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
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
    
    
}
