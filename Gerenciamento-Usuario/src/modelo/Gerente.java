package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Gerente extends Funcionario{
    protected String departamento;
    protected double bonus;

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
    public void calculaAcrescimo(){
        LocalDate atual = LocalDate.now();
        int acrescimo = Period.between(super.getData_admissao(), atual).getYears();
        System.out.println(acrescimo);
        setSalario(super.getSalario() + (super.getSalario()*acrescimo*0.01)+getBonus());
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("DEPARTAMENTO: "+ departamento);
        System.out.println("BONUS: "+ bonus);
        System.out.println("X---------------------------------------X");
        return "";
    }
    
}
