package modelo;

import java.time.LocalDate;

public class Docente {
    private String nome;
    private String cpf;
    private String email;
    private String genero;
    private String formacao;
    private LocalDate dataNascimento;

    public Docente() {
    }

    public Docente(String nome, String cpf, String email, String genero, String formacao, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.genero = genero;
        this.formacao = formacao;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
