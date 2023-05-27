package modelo;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
    protected double salario;
    protected String ctps;
    protected LocalDate data_admissao;

    public Funcionario() {
    }

    public Funcionario(double salario, String ctps, LocalDate data_admissao, Endereco endereco, String nome, String login, String senha, String email, String cpf) {
        super(endereco, nome, login, senha, email, cpf);
        this.salario = salario;
        this.ctps = ctps;
        this.data_admissao = data_admissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public LocalDate getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(LocalDate data_admissao) {
        this.data_admissao = data_admissao;
    }

    public void calculaAcrescimo(){
        LocalDate atual = LocalDate.now();
        double diferenca = atual.toEpochDay() - this.data_admissao.toEpochDay();
        
        if(diferenca%365 == 0){
            this.salario = (salario*((diferenca/365)/100));
        }
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("SALARIO......: R$" + salario);
        System.out.println("CTPS.........: " + ctps);
        System.out.println("DATA_ADMISSAO: " + data_admissao);
        return "";
    }

    
    
    
}
