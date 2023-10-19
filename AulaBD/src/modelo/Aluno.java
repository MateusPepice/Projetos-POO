package modelo;

public class Aluno {
    private Integer id_aluno;
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Aluno() {
        this.endereco = new Endereco();
    }

    public Aluno(Integer id_aluno, String nome, String cpf, Endereco endereco) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Integer getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_aluno = id_aluno;
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
        return "\nOBJETO "+id_aluno+"\nid_aluno: "+id_aluno+"\nnome: "+nome+"\ncpf: "+cpf;
    }
    
    
}
