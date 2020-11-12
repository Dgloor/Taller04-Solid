package LSP.correctCode;

public class Piano extends Instrumento{
	private String marca;
	private int octavas;
	
	public Piano(String marca, int octavas) {
		this.marca = marca;
		this.octavas = octavas;
	}
	
	void presionarNotaMusical() {
		presionarTecla();
	}

	
	void presionarTecla() {
		System.out.println("Presionando nota musical...");	
	}

}
