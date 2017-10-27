import java.util.Arrays;

public class TestFigures {

    public static double suma(Figura[] f){
        double suma = 0;
        for (Figura r:f){
            suma = suma+r.area();
        }
        return suma;
    }



    public static void main(String[] args) {
        Figura[] f = new Figura[4];
        f[0] = new Cercle(90);
        f[1] = new Cuadrado(20);
        f[2] = new Rectangle(32,31);
        f[3] = new Triangle(8,44);


        System.out.println(suma(f));
        Arrays.sort(f);

        for (Figura r:f) {
            System.out.println(r.area());
        }
    }



}
