package Polimorfismo;

import java.util.ArrayList;

public class MainFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        Figura circulo = new Circulo(1);
        Figura rectangulo = new Rectangulo(2, 2);
        Figura rectangulo2 = new Rectangulo(3, 3);
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(rectangulo2);
        for(Figura figura : figuras){
            System.out.println(figura.calcularArea());
        }
    }
}
