package main;

import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import modelo.Endereco;
import persistencia.DaoAluno;
import persistencia.DaoEndereco;

public class Main {
    
    public static void main(String[] args) {  
        
        List<Aluno> alunos = new ArrayList<>();
        DaoEndereco daoEndereco = new DaoEndereco();
        DaoAluno daoAluno = new DaoAluno();

           Endereco end = new Endereco(null, "Cascavel", "Voluntarios da Patria", "3949");
           //daoEndereco.salvar(end);
           
           Aluno al = new Aluno(null, "Mateus Pepice", "08346661975", end);
           daoAluno.salvar(al);
           
        System.out.println("\n=======================\n"
                + "Deu certo! rsrs");
    }

}
