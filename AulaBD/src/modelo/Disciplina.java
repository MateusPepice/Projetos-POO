package modelo;

public class Disciplina {
    private Integer id_disciplina;
    private String nome;
    private Integer cargaHoraria;
    private Integer semestre;
    private Curso fk_curso;

    public Disciplina() {
    }

    public Disciplina(Integer id_disciplina, String nome, Integer cargaHoraria, Integer semestre, Curso fk_curso) {
        this.id_disciplina = id_disciplina;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.semestre = semestre;
        this.fk_curso = fk_curso;
    }

    public Integer getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(Integer id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Curso getFk_curso() {
        return fk_curso;
    }

    public void setFk_curso(Curso fk_curso) {
        this.fk_curso = fk_curso;
    }

    @Override
    public String toString() {
        return "ID: "+id_disciplina+" Nome: "+nome+" Carga Horaria: "+cargaHoraria
                +" Semestre: "+semestre;
    }
    
    
}
