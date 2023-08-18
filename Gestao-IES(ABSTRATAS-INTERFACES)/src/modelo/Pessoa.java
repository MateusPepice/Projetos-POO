package modelo;

import java.time.LocalDate;

public abstract class Pessoa {
   protected String nome; 
   protected String cpf; 
   protected LocalDate dataNascimento; 
   protected Endereco endereco;
   protected String email;

    public Pessoa() {
        this.endereco = new Endereco();
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String exibirInformacoes(){
        return "NOME: " + nome + " CPF: " + cpf + " DATA DE NASCIMENTO: " + dataNascimento 
                + " ENDERECO: "+ endereco +"\n";
    }

    
}
