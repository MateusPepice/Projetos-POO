package modelo;

public class Aluno extends Pessoa{
    private Curso curso;

    public Aluno() {
        this.curso = new Curso();
    }

    public Aluno(Curso curso, Integer id, String nome, String cpf, Endereco endereco) {
        super(id, nome, cpf, endereco);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return super.toString()+
                "\n----------------CURSO---------------------\n"
                +curso.toString()+"\n\n";
    }

}
