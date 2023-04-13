public class Artista {
    String nombre;
    int id;
    String estiloMusical;

    public void cantar() throws InterruptedException {
        System.out.println("la la la");
        Thread.sleep(2000);
        System.out.println("le le le");


    }
}
