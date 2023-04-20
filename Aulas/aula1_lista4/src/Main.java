public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        fusca.marca = "volkswagen";
        fusca.ano = 2000;
        fusca.farolLigado = true;

        fusca.acelerar();
        System.out.println("velocidad: " + fusca.velocidad);

        fusca.acelerar = 100;
        System.out.println("velocidad: " + fusca.velocidad);
    }
}