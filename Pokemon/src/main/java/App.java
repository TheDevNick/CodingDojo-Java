package main.java;

import main.java.classes.Pokedex;
import main.java.classes.Pokemon;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pokedex dex1= new Pokedex();
        Pokemon p1=dex1.createPokemon("pokemon1", 100, "type1");
        Pokemon p2=dex1.createPokemon("pokemon2", 100, "type2");
        System.out.println(p1.getName()+" "+String.valueOf(p1.getHealth()));
        System.out.println(p2.getName()+" "+String.valueOf(p2.getHealth()));
        p1.attackPokemon(p2);
        System.out.println("affter attack");
        System.out.println(p1.getName()+" "+String.valueOf(p1.getHealth()));
        System.out.println(p2.getName()+" "+String.valueOf(p2.getHealth()));
        System.out.println("Pokemon names:");
        dex1.listPokemon();

	}

}
