
package modelo;

import java.util.ArrayList;


public class Curso implements IExibirInformacoes, IConsulta, Comparable<Object>{
    private String nome;
    private int cargaHoraria;
    private int qtdSemestre;
    private Professor coordenador;
    private int qtdAlunosCurso;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        coordenador = new Professor();
        disciplinas = new ArrayList<>();
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

    public int getQtdSemestre() {
        return qtdSemestre;
    }

    public void setQtdSemestre(int qtdSemestre) {
        this.qtdSemestre = qtdSemestre;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public int getQtdAlunosCurso() {
        return qtdAlunosCurso;
    }

    public void setQtdAlunosCurso(int qtdAlunosCurso) {
        this.qtdAlunosCurso = qtdAlunosCurso;
    }
    
    public void incrementarAlunos(){
        this.qtdAlunosCurso++;
    }
    
    public void decrementarAlunos(){
        this.qtdAlunosCurso--;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void adicionarDisciplinas(Disciplina novaDisciplina){
        novaDisciplina.setCurso(this);
        this.disciplinas.add(novaDisciplina);
    }
    
    public void removerDisciplinas(Disciplina novaDisciplina){
        novaDisciplina.setCurso(null);
        this.disciplinas.remove(novaDisciplina);
    }

    @Override
    public String getInformacoes() {
        return "Curso: "+ nome + "Carga Horaria: "+ cargaHoraria + "Semestres: " + qtdSemestre
                + "Coordenador: " + coordenador+"\nALUNOS MATRICULADOS: " + qtdAlunosCurso ; 
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }

    @Override
    public String chavePrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String chaveSecundaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
