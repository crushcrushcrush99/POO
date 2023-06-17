import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Caixa<BomBom> caixa = new Caixa<>();
        caixa.setElemento(new BomBom());
        caixa.imprimePeso();

       /*ListaCircular<String> listaCircular = new ListaCircular<>();
       listaCircular.adicionarElemento("Pavi");
       listaCircular.adicionarElemento("Ramos");
       listaCircular.adicionarElemento("Jose");
       listaCircular.adicionarElemento("Maria");
       listaCircular.adicionarElemento("Clara");

       listaCircular.imprimirLista();*/

    }
}
        /*List lista = new ArrayList<>();           |
        lista.add("Mateus");                        |
        lista.add(25);                              |
                                                    |
                                                    | LISTAS GENERICAS
        Lista lista = new Lista();                  |
        lista.adicionarElemento("Mateus");          |
        lista.adicionarElemento(25);                |
        lista.adicionarElemento(1.80);              |
        lista.adicionarElemento(true);              |

        for (int i = 0; i < lista.getElementos().length; i++) {
            if(lista.getElementos()[i] instanceof String){
            System.out.println((String) ((String) lista.getElementos()[i]).toUpperCase());
        }
        */


