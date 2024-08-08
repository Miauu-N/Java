package Truco;

public class Truco {
    public static void main(String[] args) {
        Jugador nico = new Jugador("Nico");
        Jugador mate = new Jugador("Mate");
        Baraja baraja = new Baraja();
        nico.agregarCartas(baraja.repartir());
        System.out.println(nico);
        mate.agregarCartas(baraja.repartir());
        System.out.println(mate);

    }
}
