
package modelo;

public class Coordenador extends Professor{

    public Coordenador() {
    }
    
    @Override
    public String exibirInformacoes(){
        return super.exibirInformacoes();
    }
    
    public int compareTo(Coordenador c) {
        return this.nome.compareToIgnoreCase(c.getNome());
    }
}
