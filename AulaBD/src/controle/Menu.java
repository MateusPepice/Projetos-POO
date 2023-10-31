package controle;

import util.Input;

public class Menu {

    public void MenuPrincipal(){
        System.out.println("=====MENU PRINCIPAL=====");
        System.out.println("1 - MODULO ALUNO");
        System.out.println("2 - MODULO ENDEREÇO");
        System.out.println("3 - MODULO CURSO");
        System.out.println("0 - SAIR");
    }
    
    public void MenuModulos(String modulo){
        System.out.println("=====MODULO "+modulo+"=====");
        System.out.println("1 - INSERIR "+modulo);
        System.out.println("2 - PESQUISAR "+modulo);
        System.out.println("3 - EDITAR "+modulo);
        System.out.println("4 - REMOVER "+modulo);
        System.out.println("5 - LISTAR "+modulo);
        System.out.println("0 - VOLTAR "+modulo);
    }
}
