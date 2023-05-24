package Enemigos;

public abstract class Enemigo{
    protected int id;
    protected int ataque;
    private int defensa;
    protected int puntosDeVida;

    public Enemigo(){
    }

    public Enemigo(int id, int ataque, int defensa, int puntosDeVida){
        this.id = id;
        this.ataque = ataque;
        this.defensa = defensa;
        this.puntosDeVida = puntosDeVida;
    }
    public void atacar(){
        System.out.println("Enemigo atacó y causó " + this.ataque + " de daño");
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getAtaque(){
        return ataque;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public int getDefensa(){
        return defensa;
    }
    public void setDefensa(int defensa){
        this.defensa = defensa;
    }
    public int getPuntosDeVida(){
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida){
        this.puntosDeVida = puntosDeVida;
    }

}
