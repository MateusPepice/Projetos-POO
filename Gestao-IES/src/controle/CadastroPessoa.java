
package controle;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    static String dado; 
    
    public static void setarDados(Pessoa pessoa){
        System.out.println("NOME:");
        pessoa.setNome(Input.nextLine());
        System.out.println("CPF:");
        pessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        pessoa.setDataNascimento(Input.nextLocalDate());
    }
    
    public static Pessoa pesquisar(ArrayList<Pessoa> busca){
        System.out.println("INFORME O CPF:");
        dado = Input.nextLine();
        for (Pessoa pessoa : busca) {
            if(pessoa.getCpf().equals(dado)){
                return pessoa;
            }
        }
        return null;
    }
    
    
}
