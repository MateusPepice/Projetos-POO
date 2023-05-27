package controle;

import modelo.Pessoa;
import util.Input;

public class CadastroPessoa {
    
    public static void setarDados(Pessoa pessoa_qualquer){
        System.out.println("NOME.:");
        pessoa_qualquer.setNome(Input.nextLine());
        System.out.println("LOGIN:");
        pessoa_qualquer.setLogin(Input.nextLine());
        System.out.println("EMAIL:");
        pessoa_qualquer.setEmail(Input.nextLine());
        System.out.println("SENHA:");
        pessoa_qualquer.setSenha(Input.nextLine());
        System.out.println("CPF..:");
        pessoa_qualquer.setCpf(Input.nextLine());
        
        System.out.println("CIDADE:");
        pessoa_qualquer.getEndereco().setCidade(Input.nextLine());
        System.out.println("RUA...:");
        pessoa_qualquer.getEndereco().setRua(Input.nextLine());
        System.out.println("NUMERO:");
        pessoa_qualquer.getEndereco().setNumero(Input.nextLine());
    }
}