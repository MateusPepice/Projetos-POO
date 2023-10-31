package main;

import controle.ControleAluno;
import controle.ControleCurso;
import controle.ControleEndereco;
import controle.Menu;
import util.Input;

public class Main {
    
    private static Menu menu = new Menu();
    private static ControleAluno cadAluno = new ControleAluno();
    private static ControleCurso cadCurso = new ControleCurso();
    private static ControleEndereco cadEndereco = new ControleEndereco();
    
    public static void main(String[] args) {
        int resposta;
        do{
            menu.MenuPrincipal();
            resposta = Input.nextInt();
            switch(resposta){
                case 1 -> cadAluno.moduloAluno("ALUNO");
                case 2 -> cadEndereco.moduloEndereco("ENDERECO");
                case 3 -> cadCurso.moduloCurso("CURSO");
                case 0 -> System.out.println("SAINDO DO SISTEMA...");
                default -> System.out.println("OPCAO INVALIDA!");
            }
        }while(resposta != 0);
    }

}
