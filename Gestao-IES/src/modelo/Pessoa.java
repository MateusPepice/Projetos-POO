package modelo;

import java.time.LocalDate;

public class Pessoa {
   protected String nome; 
   protected String cpf; 
   protected LocalDate dataNascimento; 
   protected Endereco endereco;

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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
   
    public String exibirInformacoes(){
        return "NOME: " + nome + " CPF: " + cpf + " DATA DE NASCIMENTO: " + dataNascimento 
                + " ENDERECO: "+ endereco +"\n";
    }

    
}
