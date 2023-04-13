public class Main {
    public static void main(String[] args) {
        Album album = new Album();

        Musica musica1 = new Musica();
        musica1.nombre = "Diamond Eyes";
        musica1.duracionEnSegundos = 180;
        musica1.popularidad = 7;
        musica1.genero = "nu-metal";
        album.musicas.add(musica1);

        Musica musica2 = new Musica();
        musica2.nombre = "Royal";
        musica1.duracionEnSegundos = 187;
        musica1.popularidad = 5;
        musica1.genero = "nu-metal";
        album.musicas.add(musica2);

        Musica musica3 = new Musica();
        musica3.nombre = "Beauty School";
        musica1.duracionEnSegundos = 160;
        musica1.popularidad = 8;
        musica1.genero = "nu-metal";
        album.musicas.add(musica3);

        Musica musica4 = new Musica();
        musica4.nombre = "Sextape";
        musica1.duracionEnSegundos = 120;
        musica1.popularidad = 9;
        musica1.genero = "nu-metal";
        album.musicas.add(musica4);

        Musica musica5 = new Musica();
        musica5.nombre = "976-EVIL";
        musica1.duracionEnSegundos = 190;
        musica1.popularidad = 5;
        musica1.genero = "nu-metal";
        album.musicas.add(musica5);

        album.nombre = "Diamond Eyes";
        album.nombreArtista = "Deftones";

        Musica mayorPopularidad = album.getMusicaMayorPopularidad();
        System.out.println(mayorPopularidad.popularidad);

        Musica menorDuracion = album.getMusicaMenorDuracion();
        System.out.println(menorDuracion.duracionEnSegundos);

    }
}