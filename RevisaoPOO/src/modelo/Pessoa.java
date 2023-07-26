
package modelo;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected LocalDate data;
    protected Endereco endereco;

    public Pessoa() {
        this.endereco = new Endereco();
    }

    public Pessoa(String nome, String cpf, LocalDate data, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", data=" + data + ", endereco=" + endereco + '}';
    }
    
    
}
