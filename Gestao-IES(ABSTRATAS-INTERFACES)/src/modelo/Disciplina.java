
package modelo;

public class Disciplina implements IExibirInformacao{
   private String nome;
   private int cargaHoraria;
   private int semestres;

    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
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
