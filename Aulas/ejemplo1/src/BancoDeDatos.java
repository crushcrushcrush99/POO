import java.util.ArrayList;

//GENERICS
public class BancoDeDatos <A> {
    private ArrayList<A> listaDatos = new ArrayList();
    public void adicionar(A elemento){
        listaDatos.add(elemento);
    }
}
