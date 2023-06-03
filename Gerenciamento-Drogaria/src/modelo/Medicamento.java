
package modelo;

public class Medicamento extends Produto{
    protected int numRegistroAnvisa;
    protected String composicao;
    protected double dosagem;

    public Medicamento() {
    }

    public int getNumRegistroAnvisa() {
        return numRegistroAnvisa;
    }

    public void setNumRegistroAnvisa(int numRegistroAnvisa) {
        this.numRegistroAnvisa = numRegistroAnvisa;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }
    
    
}
