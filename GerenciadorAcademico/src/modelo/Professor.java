
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
    public String getInformacoes() {
        return super.getInformacoes() + " | Formação: " + formacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
    
    
}
