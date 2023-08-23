
package modelo;

public class Funcionario extends Pessoa implements Comparable<Funcionario>{
    protected String ctps;
    protected String cargo;
    protected double salario;

    public Funcionario() {
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int compareTo(Funcionario f) {
        return this.nome.compareToIgnoreCase(f.getNome());
    }
    
    @Override
    public String getInformacoes() {
       return "";
    }
    
    @Override
    public void exibirInformacoes() {
       getInformacoes();
    }
}
