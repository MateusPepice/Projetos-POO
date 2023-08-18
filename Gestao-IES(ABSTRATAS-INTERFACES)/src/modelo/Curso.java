
package modelo;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private int qtdSemestres;
    private Professor coordenador;
    private Disciplina disciplina;

    public Curso() {
        this.coordenador = new Professor();
        this.disciplina = new Disciplina();
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
