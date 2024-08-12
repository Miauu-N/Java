package Truco;

import java.util.ArrayList;

public class Jugador {
    public ArrayList<Carta> mano;
    public String nombre;
    public int puntosmano = 0;
    public int puntospartida = 0;


    public Jugador(String nombre){
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void agregarCartas(ArrayList<Carta> cartas){
        for (Carta carta : cartas) {
            mano.add(carta);
        }
    }

    public Carta jugarCarta(int indice){
        return mano.remove(indice);
    }

    public String toString(){
        return nombre + " tiene las cartas: " + mano.toString();
    }

}
