
package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa implements Comparable<Aluno>{
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
   public String exibirInformacoes(){
       return super.exibirInformacoes() + " RA: " + ra + "\n";
   }
    
    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareToIgnoreCase(a.getNome());
    }
}
