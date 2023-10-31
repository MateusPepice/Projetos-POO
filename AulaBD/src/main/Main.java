package main;

import controle.ControleAluno;

public class Main {
    
    private static ControleAluno controleAluno = new ControleAluno();
    
    public static void main(String[] args) {              
        controleAluno.listar();
        System.out.println("DEU CERTO?");
    }

}
