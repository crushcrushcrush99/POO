import java.util.ArrayList;
public class Album {
   private String nombre;
   private String nombreArtista;
   ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMayorPopularidad() {
        int mayorPopolaridad = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidad() > mayorPopolaridad) {
                mayorPopolaridad = musicas.get(i).getPopularidad();
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracion() {
        int menorDuracion = 200;
        int indice = 0;
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).getDuracionEnSegundos() < menorDuracion){
                menorDuracion = musicas.get(i).getDuracionEnSegundos();
                indice = i;
            }
        }
        return musicas.get(indice);
    }
    public Album(){

    }
    public Album(String nombre, String nombreArtista){
        this.nombre = nombre;
        this.nombreArtista = nombreArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
}
