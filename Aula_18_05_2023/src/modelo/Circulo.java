package modelo;
public class Circulo extends Forma_geometrica{
    private double raio;
    private double const_pi = Math.PI;
    
    public Circulo() {
    }

    public Circulo(double raio, float area) {
        super(area);
        this.raio = raio;
    }
      
    public Circulo(float area, float raio) {
        this.area = area;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcula_area(){
        area = const_pi*(raio*raio);
        return area;
    }
}
