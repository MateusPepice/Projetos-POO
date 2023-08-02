
package modelo;

public class Professor extends Funcionario{
    protected String formacao;

    public Professor() {
    }

    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() + "FORMACAO: " + formacao + "\n"; 
    }
}
