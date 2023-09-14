
package modelo;


public class Curso implements IExibirInformacoes{
    private String nome;
    private int cargaHoraria;
    private int semestre;

    public Curso() {
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int qtdAlunosMatriculados(){
        return;
    }
    
    @Override
    public String getInformacoes() {
        return nome + " | Carga Horária: " + cargaHoraria + " horas" + " | Semestre: " + semestre;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
    
}
