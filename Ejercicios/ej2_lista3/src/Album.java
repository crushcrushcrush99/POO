import java.util.ArrayList;
public class Album {
    String nombre;
    String nombreArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMayorPopularidad() {
        int mayorPopolaridad = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidad > mayorPopolaridad) {
                mayorPopolaridad = musicas.get(i).popularidad;
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracion() {
        int menorDuracion = 200;
        int indice = 0;
        for(int i = 0; i < musicas.size(); i++){
            if(musicas.get(i).duracionEnSegundos < menorDuracion){
                menorDuracion = musicas.get(i).duracionEnSegundos;
                indice = i;
            }
        }
        return musicas.get(indice);
    }

}
