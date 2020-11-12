package SRP;


public class Persona{
	
	
	private String nombre;
	private String genero;
	private int edad;
	private Cedula cedula;
	
	
	public Persona(String nombre, String genero, int edad, Cedula cedula){
		
		
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.cedula = cedula;
		
	}
	
	//En esta clase quedan solo metodos que corresponden con el comportamiento
	// de una persona
	public void saludar() {
		System.out.println("Hola!");
	}

}
