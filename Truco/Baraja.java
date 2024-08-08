package Truco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baraja {
    ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja(){
        baraja = new ArrayList<>();
        String[] palos = {"Espada","Basto","Copa","Oro"};
        for (String palo : palos) {
            for (int i = 1; i < 11; i++) {
                int x = i;
                if (x > 7) {
                    x = i + 2;
                }
                Carta carta = new Carta (palo, x);
                baraja.add(carta);
            }
        }
    }

    public ArrayList<Carta> repartir(){
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int lugar = (int) (Math.random() * 100) % baraja.size();
            mano.add(baraja.remove(lugar));
        }
        return mano;
    }

    public String toString(){
        return baraja.toString();
    }
    
}
