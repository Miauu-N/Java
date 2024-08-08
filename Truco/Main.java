package Truco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el nombre del primer jugador: ");
        Jugador Player1 = new Jugador(scanner.nextLine());

        System.out.println("ingrese el nombre del segundo jugador: ");
        Jugador Player2 = new Jugador(scanner.nextLine());

        Ronda ronda1 = new Ronda(Player1, Player2);
        
        Baraja baraja = new Baraja();

        Player1.agregarCartas(baraja.repartir());
        System.out.println(Player1);

        Player2.agregarCartas(baraja.repartir());
        System.out.println(Player2);

        System.out.println(Player1.nombre +" elija su primera carta (0-2): ");
        ronda1.JugarRondaPrimera(scanner.nextInt());

        System.out.println(Player2.nombre +" elija su primera carta (0-2): ");
        ronda1.JugarRondaSegunda(scanner.nextInt());

        if (ronda1.ganador == null) {
            System.out.println("Empate");
        }
        else {
            System.out.println("Ganador de la ronda: " + ronda1.ganador.nombre);
        }
        Player1.mano.clear();
        Player2.mano.clear();

        scanner.close();
    }
    public static void darCartas(Jugador p1,Jugador p2){

    }
}
