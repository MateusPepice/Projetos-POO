package modelo;

public class Pessoa implements Comparable<Pessoa>{
    private Integer id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(Integer id, String nome, String cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "ID: "+id+" Nome: "+nome+" CPF: "+cpf
         +"\n----------------ENDERECO---------------------\n"
         +endereco.toString();
    }
    
    
    
    @Override
    public int compareTo(Pessoa p) {
        return this.nome.compareToIgnoreCase(p.getNome());
    }
}
