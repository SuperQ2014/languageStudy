package abstractexample;

public class Execution {

	public static void main(String[] args) {
		ElectricGuitar guitar = new ElectricGuitar();
		ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
		
		guitar.play();
		bassGuitar.play();
		
		ElectricGuitar anotherGuitar = new ElectricGuitar(23);
		ElectricBassGuitar anotherBassGuitar = new ElectricBassGuitar(50);
		
		anotherGuitar.play();
		anotherBassGuitar.play();
	}
}
