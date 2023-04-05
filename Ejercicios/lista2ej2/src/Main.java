import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantHabitantes = 3;
        int contador = 0;
        int totalHijos = 0;
        double totalSalario = 0;
        double mayorSalario = 0;
        double sumatorioSalario = 0;

        System.out.println("Cantidad de habitantes " + cantHabitantes);

        while (contador < cantHabitantes) {
            System.out.println("Salario de ciudadano: ");
            int salario = scanner.nextInt();

            totalSalario = totalSalario + salario;

            System.out.println("Número de hijos de ciudadano: ");
            int hijos = scanner.nextInt();

            totalHijos = totalHijos + hijos;

            if (salario > mayorSalario) {
                mayorSalario = salario;
            }

            sumatorioSalario = sumatorioSalario + salario;
            contador++;

        }
            double mediaSalario = totalSalario / cantHabitantes;
            int mediaHijos = totalHijos / cantHabitantes;

            System.out.println("la media salarial es: " + mediaSalario + "\n");
            System.out.println("la media de hijos: " + mediaHijos + "\n");
            System.out.println("el mayor salario es: " + mayorSalario);

        }
    }
