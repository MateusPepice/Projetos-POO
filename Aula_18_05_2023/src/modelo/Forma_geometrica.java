package modelo;
public class Forma_geometrica {
    protected double area;

    public Forma_geometrica() {
    }

    public Forma_geometrica(float area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    public double calcula_area(){
        return area;
    }
    
    
}
