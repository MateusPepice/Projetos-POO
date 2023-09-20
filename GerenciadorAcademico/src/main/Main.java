package main;

import controle.CadastroAluno;
import controle.CadastroCurso;
import controle.CadastroDisciplina;
import controle.CadastroFuncTerceirizado;
import controle.CadastroFuncionario;
import controle.CadastroProfessor;
import util.Input;



public class Main {

    public static void main(String[] args) {
        CadastroAluno cadAluno = new CadastroAluno();
        CadastroProfessor cadProf = new CadastroProfessor();
        CadastroFuncionario cadFunc = new CadastroFuncionario();
        CadastroFuncTerceirizado cadFuncTerc = new CadastroFuncTerceirizado();
        CadastroCurso cadCurso = new CadastroCurso();
        CadastroDisciplina cadDisciplina = new CadastroDisciplina();
        
        int escolha;
        do{
            System.out.println("-----MENU MODULOS-----");
            System.out.println("1 - CADASTRO ALUNO");
            System.out.println("2 - CADASTRO PROFESSOR");
            System.out.println("3 - CADASTRO FUNCIONARIO");
            System.out.println("4 - CADASTRO FUNCIONARIO TERCEIRIZADO");
            System.out.println("5 - CADASTRO CURSO");
            System.out.println("6 - CADASTRO DISCIPLINA");
            escolha = Input.nextInt();
            
            switch (escolha){
                case 1 -> cadAluno.cadastrar();
            }
            
        } while (escolha != 0);
    }
    
    public static void teste(){
        
    }
    
}
