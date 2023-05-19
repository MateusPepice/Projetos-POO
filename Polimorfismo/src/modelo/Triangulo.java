package modelo;
public class Triangulo extends Forma_geometrica{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura, float area) {
        super(area);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcula_area(){
        area = (base*altura)/2;
        return area;
    }
}
