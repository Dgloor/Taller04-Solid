package LSP.correctCode;

public class Flauta extends Instrumento{
	private String marca;
	
	public Flauta(String marca) {
		this.marca = marca;
	}

	void presionarNotaMusical() {
		soplar();
	}
	
	void soplar() {
		System.out.println("Presionando nota musical...");
	}
	
	

}
