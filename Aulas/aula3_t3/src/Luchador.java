public class Luchador {
    String nombre;
    double peso;
    int edad;

    public void golpear(){
        if(nombre.equals("La Tigresa Acuña")){
            System.out.println("Piña, Morder");
            return;
        }
        System.out.println("Patada, Piña");
    }
}
