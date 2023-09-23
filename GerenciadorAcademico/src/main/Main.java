package main;

import controle.CadastroAluno;
import controle.CadastroCurso;
import controle.CadastroDisciplina;
import controle.CadastroFuncTerceirizado;
import controle.CadastroFuncionario;
import controle.CadastroProfessor;
import util.Input;

public class Main {
    public static int escolha;
    static CadastroAluno cadAluno = new CadastroAluno();
    static CadastroProfessor cadProf = new CadastroProfessor();
    static CadastroFuncionario cadFunc = new CadastroFuncionario();
    static CadastroFuncTerceirizado cadFuncTerc = new CadastroFuncTerceirizado();
    static CadastroCurso cadCurso = new CadastroCurso();
    static CadastroDisciplina cadDisciplina = new CadastroDisciplina();
    
    public static void main(String[] args) {
        principal();
    }
    
   public static void principal(){
         do{
            System.out.println("-----MENU MODULOS-----");
            System.out.println("1 - CADASTRO ALUNO");
            System.out.println("2 - CADASTRO PROFESSOR");
            System.out.println("3 - CADASTRO FUNCIONARIO");
            System.out.println("4 - CADASTRO FUNCIONARIO TERCEIRIZADO");
            escolha = Input.nextInt();
             
            switch (escolha){
                case 1 -> cadAluno.menuAluno("ALUNO");
                case 2 -> cadProf.menuProfessor("PROFESSOR");
                case 3 -> cadFunc.menuFuncionario("FUNCIONARIO");
                case 4 -> cadFuncTerc.menuTerceirizado("FUNCIONARIO TERCEIRIZADO");
                default -> System.out.println("OPCAO INVALIDA!");
            }
        } while (escolha != 0);
   }
    
}
