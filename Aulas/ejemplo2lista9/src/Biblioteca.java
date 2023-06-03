import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Livro> lista = new HashMap<>();
    public void adicionar(Livro novoLivro){
        this.lista.put(novoLivro.getCodigo(), novoLivro);
    }
}
