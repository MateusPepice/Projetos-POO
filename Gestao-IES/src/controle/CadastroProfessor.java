
package controle;

import java.util.ArrayList;
import modelo.Professor;

public class CadastroProfessor {
    public static ArrayList<Professor> professores = new ArrayList<>();
    
    public static void setarDados(Professor professor){
        CadastroFuncionario.setarDados(professor);
        
        System.out.println("FORMACAO:");
    }
}
