package main.java.interfaces;
import main.java.classes.Pokemon;

public interface PokemonInterface {
    Pokemon createPokemon(String name, int health, String type);
    String pokemonInfo(Pokemon pokemon);
    void listPokemon();//do this need implementation since its void?
	
}
