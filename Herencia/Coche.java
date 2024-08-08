package Herencia;
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca,String modelo,int puertas){
        super(marca,modelo);
        this.numeroDePuertas = puertas;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
