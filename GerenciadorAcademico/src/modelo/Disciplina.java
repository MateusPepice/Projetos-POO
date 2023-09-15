
package modelo;


public class Disciplina implements IExibirInformacoes{
    private String nome;
    private int cargaHoraria;
    private int qtdSemestres;
    private Curso curso;

    public Disciplina() {
        curso = new Curso();
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
   
    @Override
    public String getInformacoes() {
        return "Disciplina: "+nome+" Carga horaria: "+cargaHoraria+" Semestres: "+qtdSemestres+" Curso: "+curso.getNome();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
    
}
