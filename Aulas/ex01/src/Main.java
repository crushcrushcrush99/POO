import java.util.Scanner;
public class Main {
    public static void main(String[] argumentos){
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();
        int edad = scanner.nextInt();
        double peso = scanner.nextDouble();
        boolean estaEmpleado = scanner.nextBoolean();

        System.out.println("Hola mundo! " + "yo soy " + nombre);

        if(estaEmpleado) {
            System.out.println("No necesita buscar empleo");
        }else if(!estaEmpleado && edad < 18){
            System.out.println("Menor de edad, no necesita buscar empleo");
        }else{
            System.out.println("necesita buscar empleo");
        }
    }
}