package Enemigos;

public class SubBoss extends Enemigo{
    public SubBoss(){
    }
    public SubBoss(int id, int ataque, int defensa, int puntosDeVida){
        super(id, ataque, defensa, puntosDeVida);
    }

    @Override
    public void atacar(){
        //Audio.reproducirAudio( "risada");
        System.out.println("El sub boss atacó y causó " + ataque + " de daño");

    }
}
