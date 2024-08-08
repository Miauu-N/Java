package Polimorfismo;

public class Circulo implements Figura {
    private double radio;

    @Override
    public double calcularArea() {
        return (radio * radio) * 3.14;
    }

    public Circulo(double radio){
        this.radio = radio;
    }
}
