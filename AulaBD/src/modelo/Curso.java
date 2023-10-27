package modelo;

public class Curso {
    private Integer id_curso;
    private String nome;
    private String cargaHoraria;
    private String qtdSemestres;

    public Curso() {
    }

    public Curso(Integer id_curso, String nome, String cargaHoraria, String qtdSemestres) {
        this.id_curso = id_curso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.qtdSemestres = qtdSemestres;
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
    
    
}
