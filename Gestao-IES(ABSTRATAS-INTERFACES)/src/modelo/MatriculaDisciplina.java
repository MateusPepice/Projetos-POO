
package modelo;

public class MatriculaDisciplina implements IExibirInformacao{
   private int ano; 
   private int semestres; 
   private int percentualFrequencia; 
   private double mediaFinal;
   private String situacao;
   private Disciplina disciplina;
   private Professor professor;
   private Aluno aluno;

    public MatriculaDisciplina() {
        this.disciplina = new Disciplina();
        this.professor = new Professor();
        this.aluno = new Aluno();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public int getPercentualFrequencia() {
        return percentualFrequencia;
    }

    public void setPercentualFrequencia(int percentualFrequencia) {
        this.percentualFrequencia = percentualFrequencia;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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
