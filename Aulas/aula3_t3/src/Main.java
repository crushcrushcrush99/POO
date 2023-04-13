public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lucha lucha = new Lucha();
        lucha.luchador1.nombre = "La Locomotora Olivera";
        lucha.luchador2.nombre = "La Tigresa Acuña";

        lucha.presentar();
        System.out.println();
        Thread.sleep(3000);
        lucha.iniciarLucha();
    }
}