package OCP;

import java.util.ArrayList;

/**
 *
 * @author jg
 */
public class FiltroPersona extends FiltroEspecificaciones {
    private String nombre;

    public FiltroPersona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public ArrayList<Cliente> AplicarFiltro(ArrayList<Cliente> clientes) {
        ArrayList<Cliente> filtro =new ArrayList<>();
        for(Cliente cliente:clientes){
            if(cliente.getNombre().equals(nombre)){
                filtro.add(cliente);
            }
        }
        return filtro;
    }
}