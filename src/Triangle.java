public class Triangle extends Figura{
    private double h;
    private double b;

    public double area(){
        return this.h*this.b/2;
    }

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }
}
