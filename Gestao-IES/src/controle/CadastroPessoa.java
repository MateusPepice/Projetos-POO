
package controle;

import java.util.ArrayList;
import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    public static ArrayList<Pessoa> cadastros = new ArrayList<>();
    static String dado; 
    
    public static void setarDados(Pessoa pessoa){
        System.out.println("NOME:");
        pessoa.setNome(Input.nextLine());
        System.out.println("CPF:");
        pessoa.setCpf(Input.nextLine());
        System.out.println("DATA DE NASCIMENTO:");
        pessoa.setDataNascimento(Input.nextLocalDate());
        setarDadosEndereco(pessoa);
    }
    
    public static void setarDadosEndereco(Pessoa pessoa){
        System.out.println("CIDADE:");
        pessoa.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA:");
        pessoa.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        pessoa.getEndereco().setNumero(Input.nextLine());
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
