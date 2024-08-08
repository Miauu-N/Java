package Colecciones;
public class Numeros {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        int sumatoria = 0;
        for(int numero : numeros){
            sumatoria += numero;
        }
        System.out.println("La sumatoria de los 10 primeros numeros es: " + sumatoria);
    }
}
