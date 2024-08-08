package ObjetosYMetodos;
public class Pokemon {
    // id,nombre,obtenido(true/false)
    public String nombre;
    public int id;
    public boolean obtenido;

    public Pokemon(int id,String nombre,boolean obtenido){
        // id,nombre,obtenido(true/false)
        this.nombre = nombre;
        this.id = id;
        this.obtenido = obtenido;
    }

    public void pokedex(){
        if (obtenido) {
            System.out.println("El pokemon " + nombre + " tiene la id: " + id + ", felicidades por obtenerlo.");
        }
        else{
            System.out.println("???");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public void setObtenido(){
        this.obtenido = true;
    }
}
