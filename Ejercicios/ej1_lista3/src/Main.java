public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        Enemigo enemi1 = new Enemigo();
        enemi1.ataque = 70;
        enemi1.defensa = 200;
        enemi1.puntos = 1000;
        mapa.enemigos.add(enemi1);


        Enemigo enemi2 = new Enemigo();
        enemi2.ataque = 200;
        enemi2.defensa = 50;
        enemi2.puntos = 1200;
        mapa.enemigos.add(enemi2);

        Enemigo enemi3 = new Enemigo();
        enemi3.ataque = 95;
        enemi3.defensa = 140;
        enemi3.puntos = 700;
        mapa.enemigos.add(enemi3);

        Heroe heroe1 = new Heroe();
        heroe1.ataque = 60;
        heroe1.defensa = 200;
        heroe1.puntos = 177;
        mapa.heroes.add(heroe1);

        Heroe heroe2 = new Heroe();
        heroe2.ataque = 160;
        heroe2.defensa = 80;
        heroe2.puntos = 300;
        mapa.heroes.add(heroe2);

        Enemigo mayorAtaque = mapa.getEnemigoMayorAtaque();
        System.out.println(mayorAtaque.ataque);

    }
}