import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"opcion 1", "opcion 2", "opcion 3"};

        String nombre = JOptionPane.showInputDialog(null, "ingrese su nombre");
        JOptionPane.showMessageDialog(null, "hola, " + nombre);
        int opcionEscojida = JOptionPane.showOptionDialog(null, "Opciones", null, 0, 0, null, opciones, null);
        System.out.println(opcionEscojida);
    }
}