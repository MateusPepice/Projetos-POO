package main;

import java.time.LocalDate;
import java.time.Month;
import modelo.Endereco;
import modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        teste();
    }
    
    public static void teste(){
       Endereco endereco = new Endereco("Cascavel", "Rua Voluntário da Patria", "3949");
       Pessoa pessoa = new Pessoa("Mateus Pepice", "083.466.619-75", LocalDate.of(2003, 06, 02), "mateuspepice@hotmail.com", endereco);
       
       pessoa.exibirInformacoes();
    }
    
}
