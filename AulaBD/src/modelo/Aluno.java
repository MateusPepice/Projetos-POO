package modelo;

public class Aluno {
    private Integer id;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Aluno() {
        this.endereco = new Endereco();
    }

    public Aluno(Integer id_aluno, String nome, String cpf, Endereco endereco) {
        this.id = id_aluno;
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
        return "\nOBJETO "+id+"\nid_aluno: "+id+"\nnome: "+nome+"\ncpf: "+cpf;
    }
    
    
}
