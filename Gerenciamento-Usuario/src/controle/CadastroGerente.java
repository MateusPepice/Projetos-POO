package controle;

import java.util.ArrayList;
import modelo.Gerente;
import util.Input;

public class CadastroGerente {
    public static ArrayList<Gerente> listaGerentes = new ArrayList<>();
    
    public static void setarDados(Gerente gerente_qualquer){
        CadastroFuncionario.setarDados(gerente_qualquer);
        
        System.out.println("DEPARTAMENTO:");
        gerente_qualquer.setDepartamento(Input.nextLine());
        System.out.println("BONUS.......:");
        gerente_qualquer.setBonus(Input.nextDouble());
        
    }
    
    public static void cadastrar(){
        Gerente novo_gerente = new Gerente();
        setarDados(novo_gerente);
        listaGerentes.add(novo_gerente);
        System.out.println("\nCadastro realizado!");
    }
    
    public static void listarGerentes(){
    
        if(listaGerentes == null || listaGerentes.isEmpty()){
            System.out.println("\nNAO HA REGISTROS CADASTRADOS!\n");
            return;
        }
        
        for (Gerente listaGerente : listaGerentes) {
            System.out.println(listaGerente);
        }
    }    
}
