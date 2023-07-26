
package controle;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public static void SetarPessoa(Pessoa novaPessoa){
        System.out.println("NOME:");
        novaPessoa.setNome(Input.nextLine());
        System.out.println("CPF:");
        novaPessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        SetarEndereco(novaPessoa);
    }
    
    public static void SetarEndereco(Pessoa novaPessoa){
        System.out.println("CIDADE:");
        novaPessoa.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA:");
        novaPessoa.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        novaPessoa.getEndereco().setNumero(Input.nextInt());
    }
    
    public static void CadastrarPessoa(){
        Pessoa novaPessoa = new Pessoa();
        SetarPessoa(novaPessoa);
        pessoas.add(novaPessoa);
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
    }
}
