package Herencia;

public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo moto = new Vehiculo("Honda", "wave");
        Vehiculo auto = new Coche("Ford", "Fiesta", 4);
        moto.mostrarInfo();
        System.out.println("....");
        auto.mostrarInfo();
    }
}
