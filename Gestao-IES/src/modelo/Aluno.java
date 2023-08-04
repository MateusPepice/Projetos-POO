
package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    protected String ra;
    protected String situacao;
    protected LocalDate dataMatricula;
    protected Curso curso;

    public Aluno() {
        this.curso = new Curso();
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

   @Override
   public String exibirInformacoes(){
       return super.exibirInformacoes() + "RA: " + ra + "SITUACAO: " + situacao 
               + "DATA DE MATRICULA: " + dataMatricula + "CURSO: " + curso.getNome() +"\n";
   }
    
}
