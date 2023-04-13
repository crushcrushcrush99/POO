public class Main {
    public static void main(String[] args) {

        int[] numeros = {4, 1, 7, 9, 3, 0};

        for (int cicloActual = 0; cicloActual < numeros.length; cicloActual++) {
            for (int posicionActual = 0; posicionActual < numeros.length - 1; posicionActual++) {
                if (numeros[posicionActual] > numeros[posicionActual + 1]) {
                    int aux = numeros[posicionActual + 1];
                    numeros[posicionActual + 1] = numeros[posicionActual];
                    numeros[posicionActual] = aux;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }
    }
}