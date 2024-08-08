package Truco;

public class Carta {
    public int numero;
    public String palo;

    public Carta(String palo, int numero){
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public String toString(){
        return numero + " de " + palo;
    }
}
