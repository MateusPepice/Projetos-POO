package sobreescrita;

import modelo.Circulo;
import modelo.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(5);
        
        System.out.println(""+c.calcula_area());
         
    }
    
}
