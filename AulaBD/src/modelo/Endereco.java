package modelo;

public class Endereco {
    private Integer id;
    private String cidade;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public Endereco(Integer id_endereco, String cidade, String rua, String numero) {
        this.id = id_endereco;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "ID: "+id+" Cidade: "+cidade+" Rua: "+rua+" Numero: "+numero;
    }
    
    
}
