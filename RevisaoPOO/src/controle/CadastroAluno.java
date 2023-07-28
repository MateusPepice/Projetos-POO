package controle;

import java.util.ArrayList;
import modelo.Aluno;
import util.Input;

public class CadastroAluno {
    public ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static void setarDados(Aluno novoAluno){
        System.out.println("RA:");
        novoAluno.setRA(Input.nextInt());
        System.out.println("CURSO:");
        novoAluno.setCurso(Input.nextLine());
        System.out.println("DATA DA MATRICULA:");
        novoAluno.setDataMatricula(Input.nextLocalDate());
        System.out.println("SITUACAO:");
        novoAluno.setSituacao(Input.nextLine());
    }
    
}
