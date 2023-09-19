package controle;

import modelo.Pessoa;
import util.Input;

/**
 * @author Mateus
 */
public class CadastroEndereco {
    public static void setarDados(Pessoa pessoa){
        System.out.println("CIDADE:");
        pessoa.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA:");
        pessoa.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        pessoa.getEndereco().setNumero(Input.nextLine());
    }

}
