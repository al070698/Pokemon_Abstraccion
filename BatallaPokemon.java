import pokemon.PokemonAgua;
import pokemon.PokemonPlanta;

public class BatallaPokemon {
    public static void main(String args[]){
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 10);
        PokemonPlata bulbasur = new PokemonPlanta("Bulbasur", 10);

        squirtle.atacar(0, bulbasur);
        System.out.println("\n");
        bulbasur.atacar(2, squirtle);
    }
}
