package LSP.badCode;

public class Piano extends Instrumento {
	private String marca;
	private int octavas;
	
	public Piano(String marca, int octavas) {
		this.marca = marca;
		this.octavas = octavas;
	}
	

	void presionarNotaMusical() {
		System.out.println("Presionando nota musical...");
	}
	
	
}
