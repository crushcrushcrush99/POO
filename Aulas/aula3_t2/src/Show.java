import java.util.ArrayList;

public class Show {
    String nombre;
    int id;
    String data;
    Artista artista = new Artista();

    public void presentar() throws InterruptedException {
        System.out.println("Con ustedes, el gran: " + artista.nombre + "!\n");
        artista.cantar();

    }

}
