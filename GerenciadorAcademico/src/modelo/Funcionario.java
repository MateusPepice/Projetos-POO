package modelo;


public class Funcionario extends Pessoa{
    protected String ctps;
    protected Double salario;
    protected String cargo;

    public Funcionario() {
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + " | CTPS: " + ctps + " | Salário: " + salario + " | Cargo: " + cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }

}
