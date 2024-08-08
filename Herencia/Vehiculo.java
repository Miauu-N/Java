package Herencia;
public class Vehiculo {
    // Atributos: marca, modelo.
    // Métodos: un constructor y un método mostrarInfo.
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo(){
        System.out.println("La marca del vehiculo es: " + marca + " y el modelo es: " + modelo);
    }
}

