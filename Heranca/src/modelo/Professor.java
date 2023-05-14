package modelo;
public class Professor extends Funcionario{
    protected String disciplina;

    public Professor() {
    }

    public Professor(String disciplina, double salario, String matricula, String nome, String email, String telefone, int idade, char genero) {
        super(salario, disciplina, matricula, nome, email, telefone, idade, genero);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
      
    @Override
    public String toString() {
        return "Professor{"+super.toString() + "disciplina=" + disciplina + '}';
    }
          
    public void exibirSalarioBonus(){
        setBonus(500);
        System.out.println("Salario: "+salario);
    }
}
