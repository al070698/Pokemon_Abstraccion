package pokemon;

public class PokemonAgua extends Pokemon {
    public PokemonAgua(String nombre, int nivel){
        super(nombre, Tipo.AGUA, nivel);
        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Pistola de Agua"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Hidropulso"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ventisca"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Rayo Hielo"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.NORMAL) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 0.5;

        return efectividad;
    }
}
