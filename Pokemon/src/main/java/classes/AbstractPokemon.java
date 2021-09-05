package main.java.classes;
import main.java.interfaces.PokemonInterface;

public abstract class AbstractPokemon implements PokemonInterface {
    AbstractPokemon(){}
    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "Name: "+ pokemon.getName()+" Type: "+pokemon.getType()+" Health: "+pokemon.getHealth();
    }

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name,health,type); 
        return pokemon;
    }
	
}
