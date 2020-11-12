package OCP;

import java.util.ArrayList;

/**
 *
 * @author JG
 */
public abstract class FiltroEspecificaciones {
    public ArrayList<Cliente> Filtrar(ArrayList<Cliente> clientes){
        return AplicarFiltro(clientes);
    }
    public abstract ArrayList<Cliente> AplicarFiltro(ArrayList<Cliente> clientes);
}