package pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public ListaMovimientos(){
        movimientos.add(new Movimiento("Pistola de Agua", 100, Tipo.AGUA, 25));
        movimientos.add(new Movimiento("Hidropulso", 120, Tipo.AGUA, 20));
        
        movimientos.add(new Movimiento("Látigo Cepa", 100, Tipo.PLANTA, 25));
        movimientos.add(new Movimiento("Hoja Afilada", 100, Tipo.PLANTA, 25));

        movimientos.add(new Movimiento("Ventisca", 185, Tipo.HIELO, 5));
        movimientos.add(new Movimiento("Rayo Hielo", 175, Tipo.HIELO, 10));

        movimientos.add(new Movimiento("Placaje", 100, Tipo.NORMAL, 35));
        movimientos.add(new Movimiento("Derribo", 175, Tipo.NORMAL, 20));
    }
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento : movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
}
