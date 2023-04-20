import java.util.ArrayList;
public class Musica {
    private String nombre;
    private int duracionEnSegundos;
    private int popularidad;
    private String genero;

    public Musica(){

    }

    public Musica(String nombre, int duracionEnSegundos, int popularidad, String genero){
       this.nombre = nombre;
       this.duracionEnSegundos = duracionEnSegundos;
       this.popularidad = popularidad;
       this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

