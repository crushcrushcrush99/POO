import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Pessoa, ArrayList>> lista = new HashMap<>();
        Pessoa cezar = new Pessoa("Cezar");
        ArrayList<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Animal("Nick"));
        listAnimal.add(new Animal("Xetos"));
        listAnimal.add(new Animal("Chocolate"));
        lista.put(cezar, listAnimal);

        /*Map<Pessoa, Animal> lista = new HashMap<>();
        lista.put(new Pessoa("Cezar"), new Animal("Nick"));
        lista.put(new Pessoa("Erica"), new Animal("Mel"));
        lista.put(new Pessoa("Sofía"), new Animal("Rodolfo"));
        lista.put(new Pessoa("Miguel"), new Animal("Penelope"));*/

        System.out.println("Pet: " + lista.get(cezar));

        ArrayList<Animal> list = lista.get(cezar);
        list.add(new Animal("Petra"));

    }
}