public class Heroe {

    private int ataque;
    private int defensa;
    private int puntos;

    public Heroe(){

    }

    public Heroe(int ataque, int defensa, int puntos){
        this.ataque = ataque;
        this.defensa = defensa;
        this.puntos = puntos;
    }

    public int getAtaque() {
        return this.ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa(){
        return this.defensa;
    }
    public void setDefensa(int defensa){
        this.defensa = ataque;
    }
    public int getPuntos(){
        return this.puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
