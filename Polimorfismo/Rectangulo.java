package Polimorfismo;

public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public double calcularArea(){
        return base * altura;
    }

    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
}
