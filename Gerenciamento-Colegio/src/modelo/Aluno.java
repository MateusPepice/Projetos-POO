package modelo;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    protected String matricula;
    protected ArrayList<Float> notas;

    public Aluno() {
    }

    public Aluno(String matricula, ArrayList<Float> notas) {
        this.matricula = matricula;
        this.notas = notas;
    }

    public Aluno(String matricula, ArrayList<Float> notas, String nome, String email, String telefone, int idade, char genero) {
        super(nome, email, telefone, idade, genero);
        this.matricula = matricula;
        this.notas = notas;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{"+super.toString() + "matricula=" + matricula + ", notas=" + notas + '}';
    }

   

    

}
