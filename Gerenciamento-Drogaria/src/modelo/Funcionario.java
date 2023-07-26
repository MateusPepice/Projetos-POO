
package modelo;

public class Funcionario extends Pessoa{
    private String ctps;

    public Funcionario() {
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "Funcionario{"+super.toString() + "CTPS: " + ctps + "}";
    }
    
    
    
}
