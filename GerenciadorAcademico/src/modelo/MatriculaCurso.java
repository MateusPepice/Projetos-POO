
package modelo;

import java.time.LocalDate;


public class MatriculaCurso implements IExibirInformacoes{
    private int ano;
    private LocalDate dataMatricula;
    private String situacao;
    private Aluno aluno;
    private Curso curso;

    public MatriculaCurso() {
        aluno = new Aluno();
        curso = new Curso();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String getInformacoes() {
        return "Aluno "+aluno.getNome()+" matriculado no curso "+curso.getNome()+" no dia "+dataMatricula
                +"\nSITUAÇÃO: "+situacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
}
