
package modelo;

public class Professor extends Funcionario{
    protected String formacao;

    public Professor() {
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes() + "FORMACAO: " + formacao + "\n"; 
    }
}
