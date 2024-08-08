package Truco;

public class Valores {
    public static int valor(Carta carta){
        int valor = 0;
        if (carta.numero == 4) {
            valor = 1;
        }
        else if (carta.numero == 5) {
            valor = 2;
        }
        else if (carta.numero == 6) {
            valor = 3;
        }
        else if (carta.numero == 10) {
            valor = 5;
        }
        else if (carta.numero == 11) {
            valor = 6;
        }
        else if (carta.numero == 12) {
            valor = 7;
        }
        else if (carta.numero == 2) {
            valor = 8;
        }
        else if (carta.numero == 3) {
            valor = 9;
        }
        else{
            switch (carta.toString()) {
                case "1 de Espada":
                    valor = 13;
                    break;
                case "1 de Basto":
                    valor = 12;
                    break;
                case "7 de Espada":
                    valor = 11;
                    break;
                case "7 de Oro":
                    valor = 10;
                    break;
            
                default:
                    valor = 4;
                    break;
                }
            }
        return valor;
    }

}
