package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Vendedor extends Funcionario{

    public Vendedor() {
    }

    @Override
    public void calculaAcrescimo(){
        LocalDate atual = LocalDate.now();
        int acrescimo = Period.between(super.getData_admissao(), atual).getYears();
        System.out.println(acrescimo);
        setSalario(super.getSalario() + (super.getSalario()*acrescimo*0.01));
    }
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("X---------------------------------------X");
        return "";
    }
           
}
