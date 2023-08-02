
package modelo;

public class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected int qtdSemestres;

    public Curso() {
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

    public int getQtdSemestres() {
        return qtdSemestres;
    }

    public void setQtdSemestres(int qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", qtdSemestres=" + qtdSemestres + '}';
    }
    
    
    
}
