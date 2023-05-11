public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        fabrica.agregarOperario(new OperadorDeCorte());
        fabrica.agregarOperario(new OperadorDeDobla());
        fabrica.agregarOperario(new OperadorDePrensa());
        System.out.println("Expediente: ");
        fabrica.iniciarExpediente();
    }
}