
package modelo;

public class Funcionario extends Pessoa{
    protected String ctps;
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

    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() + "CTPS: " + ctps + "SALARIO: R$" + salario + "\n";
    }
    
}
