package modelo;

import java.util.ArrayList;

public class Curso {
    private Integer id_curso;
    private String nome;
    private String cargaHoraria;
    private String qtdSemestres;
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList();
    }

    public Curso(Integer id_curso, String nome, String cargaHoraria, String qtdSemestres, ArrayList disciplina) {
        this.id_curso = id_curso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.qtdSemestres = qtdSemestres;
        this.disciplinas = disciplina;
    }

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getQtdSemestres() {
        return qtdSemestres;
    }

    public void setQtdSemestres(String qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }

    public void iteradorDisciplinas(){
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public String toString() {
        return "ID: "+id_curso+" Nome: "+nome+" Carga Horaria: "+cargaHoraria
                +" Semestres: "+qtdSemestres;
    }
    
    
}
