package Truco;

import java.util.ArrayList;

public class BarajaMain {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        System.out.println("Baraja: " + baraja);
        ArrayList<Carta> mano = baraja.repartir();
        System.out.println("......");
        System.out.println("Mano repartida al primer jugador: " + mano);
        System.out.println("......");
        ArrayList<Carta> mano2 = baraja.repartir();
        System.out.println("Mano repartida al segundo jugador: " + mano2);
        }
    }
