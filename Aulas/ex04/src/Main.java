public class Main {

    static int numero = 0;

    static int soma(int a, int b){
        numero++;
        return a + b;
    }
    static double calcularHipotenusa(double cateto1, double cateto2) {
        double quadradoCateto1 = Math.pow(cateto1, 2);
        double quadradoCateto2 = Math.pow(cateto2, 2);

        return Math.sqrt(quadradoCateto1 + quadradoCateto2);
    }

    public static void main(String[] args){
        double resultado = calcularHipotenusa(3, 4);
        System.out.println(resultado);

    }
}