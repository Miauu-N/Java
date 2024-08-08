package ObjetosYMetodos;
public class Ash {
    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon(1,"Bulbasaur",true);
        Pokemon charmander = new Pokemon(4, "Charmander", false);
        bulbasaur.pokedex();
        charmander.pokedex();
        System.out.println("El nombre de tu primer pokemon es: " + bulbasaur.getNombre());
        charmander.setObtenido();
        charmander.pokedex();
    }
}
