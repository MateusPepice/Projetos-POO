
package controle;

import java.util.ArrayList;
import modelo.Coordenador;

public class CadastroCoordenador {
    public static ArrayList<Coordenador> coordenadores = new ArrayList<>();
    
    public static void setarDados(Coordenador coordenador){
        CadastroProfessor.setarDados(coordenador);
    }
    
    public static void cadastrar(){
        Coordenador coordenador = new Coordenador();
        setarDados(coordenador);
        coordenadores.add(coordenador);
        System.out.println("COORDENADOR CADASTRADO!");
    }

}
