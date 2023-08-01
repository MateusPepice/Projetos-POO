package modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    protected String RA;
    protected String curso;
    protected LocalDate dataMatricula;
    protected String situacao;

    public Aluno() {
    }
    
    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    @Override
    public String toString() {
        return "Aluno{" + "RA=" + RA + ", curso=" + curso + ", dataMatricula=" + dataMatricula + ", situacao=" + situacao + '}';
    }
          
    @Override
    public void exibirInformacoes(){
        System.out.println(nome + " "+ RA + " - " + calculaIdade() + " anos" 
                            + "\nCurso: " + curso + dataMatricula.getYear() + " - " + situacao);
        System.out.println("\n---------------------------------------------");
    }
}