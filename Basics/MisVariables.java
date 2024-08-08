package Basics;
public class MisVariables {
    public static void main(String[] args) {
        String nombre = "Miau";
        int edad = 19;
        boolean is_Pelotudo = false;

        if (is_Pelotudo) {
            System.out.println(nombre + " es un pelotudo");
        }
        else if (edad > 18) {
            System.out.println(nombre + " no es un pelotudo pero puede caer en cana");
        }
        else{
            System.out.println("Anashei");
        }
    }
}
