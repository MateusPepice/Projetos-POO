package controle;

import static main.Main.escolha;
import util.Input;

/**
 * @author MPEPICE
 */
public class Menus {
    
    public int menuModuloEspecifico(String modulo){
        modulo.toUpperCase();
        System.out.println("-----MODULO "+modulo+"-----");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - ALTERAR");
        System.out.println("3 - PESQUISAR");
        System.out.println("4 - REMOVER");
        System.out.println("5 - LISTAR");
        System.out.println("0 - VOLTAR");
        escolha = Input.nextInt();
        return escolha;
    }
}
