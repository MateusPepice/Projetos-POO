public class Carro {
    private int qtdPortas;
    private String cor;
    private String modelo;
    private double potencia;

    public Carro() {
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public Carro clonar(){
        Carro cloneCarro = new Carro();
        cloneCarro.setQtdPortas(this.qtdPortas); 
        cloneCarro.setCor(this.cor); 
        cloneCarro.setModelo(this.modelo);   
        cloneCarro.setPotencia(this.potencia);    
        return cloneCarro;
    }
}
