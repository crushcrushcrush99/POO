import Enemigos.Boss;
import Enemigos.Enemigo;
import Enemigos.EnemigoComun;
import Enemigos.SubBoss;

public class Main {
    public static void main(String[] args) {

        EnemigoComun enemigoComun = new EnemigoComun(1,20,30,20);
        enemigoComun.atacar();

        //Thread.sleep(3000);

        SubBoss subBoss = new SubBoss(2, 100, 100, 1000);
        subBoss.atacar();

        //Thread.sleep(3000);

        Boss boss = new Boss(3, 100, 300, 2000);
        boss.atacar();
    }
}