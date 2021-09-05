package main.java.classes;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon  {
    private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
    public Pokedex(){}
    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon =super.createPokemon(name, health, type);
        this.myPokemons.add(pokemon);
        return pokemon;
    }
    @Override
    public void listPokemon() {
        for (int i = 0; i <myPokemons.size() ; i++) {
            System.out.println(myPokemons.get(i).getName());
        }
    }
}
