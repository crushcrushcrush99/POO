import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons;

    public Pokedex() {
        this.pokemons = new HashMap<>();
    }
    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }
    public void agregarPokemon(Pokemon pokemon){
        String codigoIdentificador = pokemon.getCodigoIdentificador();
        this.pokemons.put(codigoIdentificador, pokemon);
    }
}
