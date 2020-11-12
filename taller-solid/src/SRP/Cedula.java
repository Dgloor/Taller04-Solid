package SRP;
import java.util.regex.*; 
import java.util.Date;


public class Cedula {
	private String numCedula;
	private Date fechaExpedicion;
	private Date fechaCaducidad;
	// otros atributos más
	
	
	public Cedula(String numCedula, Date fechaExpedicion, Date fechaCaducidad) {
		
		if(this.validarNumCedula(numCedula)) {
			this.numCedula = numCedula;
		}
		else {
			throw new Error("Número de cédula inválido.");
		}
		this.fechaExpedicion = fechaExpedicion;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	//En esta clase tiene sentido que exista un método de este tipo
	//ya que aquí sí se tiene que comprombar que las cédulas tengan
	//formato y datos correctos
	private boolean validarNumCedula(String numCedula){
		Pattern p = Pattern.compile("(0[1-9]|1\\d|2[0-4])\\d{8}");
		Matcher m = p.matcher(numCedula);
		return m.matches();
	}

}
