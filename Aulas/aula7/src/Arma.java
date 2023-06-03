public class Arma {
    private String nombre;
    private int puntosDeAtaque;

    public Arma(String nombre, int puntosDeAtaque) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }
}
