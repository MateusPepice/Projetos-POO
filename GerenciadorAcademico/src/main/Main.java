package main;

import controle.CadastroPessoa;
import java.time.LocalDate;
import java.time.Month;
import modelo.Endereco;
import modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        teste();
    }
    
    public static void teste(){
       CadastroPessoa cadPessoa = new CadastroPessoa();
       cadPessoa.cadastrar();
       cadPessoa.cadastrar();
       cadPessoa.cadastrar();
       cadPessoa.cadastros.get(0).getCpf();
       cadPessoa.cadastros.get(1).getCpf();
       cadPessoa.cadastros.get(2).getCpf();
    }
    
}
