
package controle;

import java.util.ArrayList;
import modelo.Funcionario;

public class CadastroFuncionario {
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public static void setarDados(Funcionario funcionario){
       CadastroPessoa.setarDados(funcionario);
       
        System.out.println("CTPS:");
        System.out.println("SALARIO:");
    }
        
}
