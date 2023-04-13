public class Lucha {
    Luchador luchador1 = new Luchador();
    Luchador luchador2 = new Luchador();

    void presentar(){
        System.out.println("De un lado, pesando " + luchador1.peso + "kg, tenemos a " + luchador1.nombre);
        System.out.println("Del otro lado, pesando " + luchador2.peso + "kg, tenemos a " + luchador2.nombre);
    }

    public void iniciarLucha(){
        System.out.println("Luchador 1, golpeó: ");
        luchador1.golpear();

        System.out.println("Luchador 2, golpeó: ");
        luchador2.golpear();
    }
}
