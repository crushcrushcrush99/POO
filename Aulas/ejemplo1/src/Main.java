import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BancoDeDatos <Animal> bancoDeAnimais = new BancoDeDatos();
        bancoDeAnimais.adicionar(new Animal());

        BancoDePessoas <Pessoa> bancoDePessoas = new BancoDePessoas();
        bancoDePessoas.adicionar(new Pessoa());

        BancoDeNomes <String> bancoDeNomes = new BancoDeNomes<>();
        bancoDeNomes.adicionar("Sofía");

        Par<String, String> parNomes = new Par<>();
        parNomes.criar( "Cezar", "Fabio");

        Par<Pessoa, Animal> parDonoPet = new Par<>();
        parDonoPet.criar(new Pessoa(), new Animal());


        //BancoDeDatos.adicionar("Cezar"); //sim, e um nome
        //BancoDeDatos.adicionar(1); // e um nome?
        //BancoDeNomes.adicionarNomes(new ArrayList()); // e um nome?

    }
}