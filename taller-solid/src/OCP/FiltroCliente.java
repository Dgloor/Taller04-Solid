package OCP;

import java.util.ArrayList;

/**
 *
 * @author JJGR
 */
public class FiltroCliente {
    public ArrayList<Cliente> FiltroPor(ArrayList<Cliente> clientes,FiltroEspecificaciones filtro){
        return filtro.AplicarFiltro(clientes);
    }
}