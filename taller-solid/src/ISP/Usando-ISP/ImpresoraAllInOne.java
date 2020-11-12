package isp;

public class ImpresoraAllInOne implements Impresora,Escaner,Fax{

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando...");
    }
    
    
}
