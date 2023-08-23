
package controle;

import util.Input;

public class MenuCadastros {
    public static void menuPrincipal(){
        System.out.println("\n-----MENU PRINCIPAL-----");
        System.out.println("1 - MODULO PESSOA");
        System.out.println("2 - MODULO ALUNO");
        System.out.println("3 - MODULO FUNCIONARIO");
        System.out.println("4 - MODULO PROFESSOR");
        System.out.println("5 - MODULO CURSO");
        System.out.println("6 - MODULO DISCIPLINA");
        System.out.println("0 - VOLTAR");
    }
    
    public static void menuCadastros(String entidade){
        System.out.println("\n-----MODULO "+entidade+"-----");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - ALTERAR");
        System.out.println("3 - REMOVER");
        System.out.println("4 - BUSCAR");
        System.out.println("5 - LISTAR");
        System.out.println("0 - VOLTAR");
    }
    
    public static int selecaoMenu(){
        menuPrincipal();
        System.out.println("OPCAO:");
        return Input.nextInt();
    }
    
    public static int selecaoCadastros(String entidade){
        menuCadastros(entidade);
        System.out.println("OPCAO:");
        return Input.nextInt();
    }
}
