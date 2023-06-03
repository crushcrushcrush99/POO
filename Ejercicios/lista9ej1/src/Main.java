public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.agregarPokemon(new Pokemon("0002", "Ivysaur", "Planta/Veneno"));
        pokedex.agregarPokemon(new Pokemon("0095", "Onix", "Roca/Tierra"));
        pokedex.agregarPokemon(new Pokemon("0065", "Alakazam", "Psíquico"));
    }
}