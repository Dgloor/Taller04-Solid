package LSP.badCode;

public class Flauta extends Instrumento{
	private String marca;
	
	public Flauta(String marca) {
		this.marca = marca;
	}

	void presionarNotaMusical() {
		System.out.println("Error, no se puede presionar una tecla musical");
	}

}
