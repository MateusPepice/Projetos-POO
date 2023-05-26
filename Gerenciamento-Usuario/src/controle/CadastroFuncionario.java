package controle;

import modelo.Funcionario;
import util.Input;

public class CadastroFuncionario {
    
    public static void setarDados(Funcionario funcionario_qualquer){
    
        System.out.println("SALARIO.........:");
        funcionario_qualquer.setSalario(Input.nextDouble());
        System.out.println("CTPS............:");
        funcionario_qualquer.setCtps(Input.nextLine());
        System.out.println("DATA DE ADMISSAO:");
        funcionario_qualquer.setData_admissao(Input.nextLocalDate());
        
        CadastroPessoa.setarDados(funcionario_qualquer);
        
    }
    
}
