package modelo;

import java.time.LocalDate;

public class Gerente extends Funcionario{
    private String departamento;
    private double bonus;

    public Gerente() {
    }

    public Gerente(String departamento, double bonus, double salario, String ctps, LocalDate data_admissao, Endereco endereco, String nome, String login, String senha, String email, String cpf) {
        super(salario, ctps, data_admissao, endereco, nome, login, senha, email, cpf);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "departamento=" + departamento + ", bonus=" + bonus + '}';
    }

}
