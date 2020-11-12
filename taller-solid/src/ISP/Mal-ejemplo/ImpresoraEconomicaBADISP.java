package isp;

public class ImpresoraEconomicaBADISP implements DispositivoInteligenteBADISP{

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void enviarFax() { //No realiza esta acción
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void escanear() { //No realiza esta acción
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
