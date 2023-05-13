package modelo;
public class Pessoa{
    private String cpf;
    private String nome;
    private int idade;
    private String profissao;
    private double remuneracao;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, int idade, String profissao, double remuneracao) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.remuneracao = remuneracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + ", remuneracao=" + remuneracao + '}';
    }
    
    
}
