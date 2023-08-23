package main;

import controle.CadastroCurso;
import controle.CadastroPessoa;
import controle.MenuCadastros;
import static controle.MenuCadastros.menuPrincipal;
import util.Input;

public class Main {
    
    
    public static void main(String[] args) {
        int resposta;
        do{
            resposta = MenuCadastros.selecaoMenu();
            switch (resposta){
               /* case 1 -> CadastroPessoa.menuControlePessoa("PESSOA");
                case 2 -> CadastroPessoa.menuControlePessoa("ALUNO");
                case 3 -> CadastroPessoa.menuControlePessoa("FUNCIONARIO");
                case 4 -> CadastroPessoa.menuControlePessoa("PROFESSOR");
                case 5 -> CadastroPessoa.menuControlePessoa("CURSO");
                case 6 -> CadastroPessoa.menuControlePessoa("DISCIPLINA");*/
                default -> System.out.println("OPCAO INVALIDA!");
            }
        } while (resposta != 0);
    }   
}
