
package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    protected String ra;

    public Aluno() {

    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
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
