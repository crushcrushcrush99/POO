public class Matematica {
    public Matematica(){
    }
    public static double calcularHipotenusa(double cateto1, double cateto2){
        double sumaCuadradosCatetos = Math.pow(cateto1, 2.0) + Math.pow(cateto2, 2.0);
        return Math.sqrt(sumaCuadradosCatetos);
    }

    public static double elevartAlCuadrado(double numero){
        return numero * numero;
    }
}
