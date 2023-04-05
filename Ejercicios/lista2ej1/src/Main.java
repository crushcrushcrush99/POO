 public class Main {
        public static String categoriaNadador(int edad){
        if(edad > 0 && edad <= 10){
            return "Infantil";
        }else if (edad > 10 && edad <= 17){
            return "Juvenil";
        }else if(edad > 17 && edad < 120){
            return "Adulto";
        }else{
            return "Edad inválida";
        }
    }

        public static void main(String[] args)
        {
            String retorno = categoriaNadador( 16);
            System.out.println(retorno);
        }
    }
