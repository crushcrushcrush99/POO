import java.util.ArrayList;
public class Mapa {
    private String nombre;
    private int altura;
    private int tamanho;

    ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
    ArrayList<Heroe> heroes = new ArrayList<Heroe>();

    public Enemigo getEnemigoMayorAtaque() {
        int mayorAtaque = 0;
        int indice = 0;

        for (int contador = 0; contador < enemigos.size(); contador++) {
            if (enemigos.get(contador).getAtaque() > mayorAtaque) {
                mayorAtaque = enemigos.get(contador).getAtaque();
                indice = contador;

            }
        }
        return enemigos.get(indice);
    }
    public Mapa(){

    }
    public Mapa(String nombre, int altura, int tamanho){
        this.nombre = nombre;
        this.altura = altura;
        this.tamanho = tamanho;
    }
    public String getNombre()
    {
        return  this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public int getAltura()
    {
        return  this.altura;
    }
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    public int getTamanho()
    {
        return  this.tamanho;
    }
    public void setTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }
}

