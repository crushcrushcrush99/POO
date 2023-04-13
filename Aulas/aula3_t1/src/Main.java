public class Main {

    public static void main(String[] args){

        Profesor[] profesores = new Profesor[10];

        for(int i = 0; i < profesores.length; i++){
            profesores[i] = new Profesor();
        }
        profesores[0].nombre = "Mateus";
        System.out.println(profesores[0].nombre);


        /*profesores.nombre = "Mateus";*/

        Alumno alumno = new Alumno();
        alumno.email = "abc@gmail.com";

    }
}