package gerenciamento;

import java.io.IOException;
import java.util.ArrayList;

public class Usuario {
    private long cpf;
    private String nome;
    private int matricula;
    private String telefone;

    public Usuario() {
    }

    public Usuario(long cpf, String nome, int matricula, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}