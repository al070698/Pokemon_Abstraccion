package pokemon;

public class PokemonPlanta extends Pokemon{
    public PokemonPlanta(String nombre, int nivel){
        super(nombre, Tipo.PLANTA nivel);
        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Látigo Cepa"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Hoja Afilada"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Placaje"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Derribo"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.AGUA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.BICHO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.HIELO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = .05;
        if(pokemon.getTipo()== Tipo.ACERO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.DRAGON) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 0.5;

        return efectividad;
    }
}
