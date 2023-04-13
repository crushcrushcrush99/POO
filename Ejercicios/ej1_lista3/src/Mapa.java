import java.util.ArrayList;
public class Mapa {
    String nombre;
    int altura;
    int tamanho;

    ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
    ArrayList<Heroe> heroes = new ArrayList<Heroe>();

    public Enemigo getEnemigoMayorAtaque() {
        Enemigo mayorAtaque = new Enemigo();

        for (Enemigo item : this.enemigos) {
            if (item.ataque > mayorAtaque.ataque) {
                mayorAtaque = item;

            }
        }
        return mayorAtaque;

    }

}
