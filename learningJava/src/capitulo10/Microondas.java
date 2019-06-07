package capitulo10;

public class Microondas implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Microondas ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("Microondas desligando...");
	}
	
	public void aquecer() {
	}
	
	public void assar() {
		
	}

}
