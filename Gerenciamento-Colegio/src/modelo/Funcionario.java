package modelo;
public class Funcionario extends Pessoa {
    protected double salario;
    protected String matricula;

    public Funcionario() {
    }

    public Funcionario(double salario, String disciplina, String matricula, String nome, String email, String telefone, int idade, char genero) {
        super(nome, email, telefone, idade, genero);
        this.salario = salario;
        this.matricula = matricula;
    }


    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "Funcionario{"+super.toString() + "salario=" + salario + '}';
    }

    protected void setBonus(float bonus){
        this.salario += bonus;
    }
    
}
