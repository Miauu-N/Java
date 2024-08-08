package Colecciones;
import java.util.ArrayList;

public class Paises {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Argentina");
        paises.add("Francia");
        paises.add("Alemania");
        paises.add("España");
        paises.add("Holanda");
        for(String pais : paises){
            System.out.println(pais);
        }
        paises.remove(4);
        System.out.println("...");
        for(String pais : paises){
            System.out.println(pais);
        }
    }
}
