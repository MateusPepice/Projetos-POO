package modelo;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private LocalDate data_admissao;
    private double salario;
    private String cpts;

    public Funcionario() {
    }

    // Construtor extendido
    public Funcionario(LocalDate data_admissao, double salario, String cpts, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.data_admissao = data_admissao;
        this.salario = salario;
        this.cpts = cpts;
    }

    public LocalDate getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(LocalDate data_admissao) {
        this.data_admissao = data_admissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpts() {
        return cpts;
    }

    public void setCpts(String cpts) {
        this.cpts = cpts;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "data_admissao=" + data_admissao + ", salario=" + salario + ", cpts=" + cpts + '}';
    }
    
    
    
}
