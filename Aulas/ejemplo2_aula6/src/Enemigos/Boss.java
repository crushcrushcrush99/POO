package Enemigos;

import java.util.Random;

public class Boss extends Enemigo{
    public Boss(){
    }
    public Boss(int id, int ataque, int defensa, int puntosDeVida){
        super(id, ataque, defensa, puntosDeVida);
    }

    @Override
    public void atacar(){
        Random random = new Random();
        int numeroSorteado = random.nextInt(10);

        if(numeroSorteado < 5){
            //Audio.reproducirAudio( "fool");
            System.out.println("El boss atacó y causó " + ataque + " de daño");
        }else if(numeroSorteado >= 4 && numeroSorteado <= 6){
            System.out.println("Boss uso un ataque especial!");
            //Audio.reproducirAudio( "especial");
            System.out.println("El boss atacó y causó " + ataque + 2 + " de daño");
        }else{
            System.out.println("BOSS USO UN ATAQUE ULTRA ESPECIAL!");
            //Audio.reproducirAudio( "especial_1");
            System.out.println("El boss atacó y causó " + ataque + 3 + " de daño");
        }
    }
}

