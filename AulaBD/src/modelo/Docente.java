package modelo;

public class Docente extends Pessoa{
    private String formacao;

    public Docente() {
    }

    public Docente(String formacao, Integer id, String nome, String cpf, Endereco endereco) {
        super(id, nome, cpf, endereco);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    
}
