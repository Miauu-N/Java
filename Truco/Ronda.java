package Truco;
import java.util.ArrayList;

public class Ronda {
    public Jugador[] jugadores;
    public ArrayList<Carta> cartasJugadas;
    public Jugador ganador = null;

    public Ronda(Jugador jugador1, Jugador jugador2){
        this.jugadores = new Jugador[2];
        this.jugadores[0] = jugador1;
        this.jugadores[1] = jugador2;
        cartasJugadas = new ArrayList<>();
    }

    public void JugarRondaPrimera(int indice){
        Carta carta = jugadores[0].jugarCarta(indice);
        cartasJugadas.add(carta);
        System.out.println("el jugador: " + jugadores[0].nombre + " Jugo " + carta);
    }

    public void JugarRondaSegunda(int indice){
        Carta carta = jugadores[1].jugarCarta(indice);
        cartasJugadas.add(carta);
        System.out.println("el jugador: " + jugadores[1].nombre + " Jugo " + carta);
        if (Valores.valor(cartasJugadas.get(0)) > Valores.valor(cartasJugadas.get(1))) {
            ganador = jugadores[0];
        }
        else if (Valores.valor(cartasJugadas.get(0)) < Valores.valor(cartasJugadas.get(1))) {
            ganador = jugadores[1];
        }
    }

    public Jugador ganador(){
        return ganador;
    }
}
