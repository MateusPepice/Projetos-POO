
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
    
    public int compareTo(Professor p) {
        return this.nome.compareToIgnoreCase(p.getNome());
    }
}
