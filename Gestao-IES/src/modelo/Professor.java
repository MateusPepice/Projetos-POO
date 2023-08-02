
package modelo;

public class Professor extends Funcionario{
    protected String formacao;

    public Professor() {
    }

    @Override
    public String toString() {
        return "Professor{" + "formacao=" + formacao + '}';
    }
    
    
}
