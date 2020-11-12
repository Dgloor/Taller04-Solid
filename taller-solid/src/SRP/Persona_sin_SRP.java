package SRP;
import java.util.regex.*;  


public class Persona_sin_SRP {
	
	
	private String nombre;
	private String genero;
	private int edad;
	private String cedula;
	
	
	public Persona_sin_SRP(String nombre, String genero, int edad, String cedula){
		
		
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		
		//VerificarCedula es una tarea que no tiene relación con
		//el comportamiento de una persona, por ende esta demás en esta clase
		if(this.validarCedula(cedula)) {
			this.cedula = cedula;
		}
		else {
			throw new Error("Cédula inválida.");
		}
		
	}

	
	private boolean validarCedula(String cedula) {
		Pattern p = Pattern.compile("(0[1-9]|1\\d|2[0-4])\\d{8}");
		Matcher m = p.matcher(cedula);
		return m.matches();
	}
	
	
	public void saludar() {
		System.out.println("Hola!");
	}

}
