package modelo;

public class Aluno implements Comparable<Aluno>{
    private Integer id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Curso curso;

    public Aluno() {
        this.endereco = new Endereco();
        this.curso = new Curso();
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "ID: "+id+" Nome: "+nome+" CPF: "+cpf
                +"\n----------------ENDERECO---------------------\n"
                +endereco.toString()
                +"\n----------------CURSO---------------------\n"
                +curso.toString()+"\n\n";
    }

    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareToIgnoreCase(a.getNome());
    }
    
    
}
