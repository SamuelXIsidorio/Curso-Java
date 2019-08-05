package capitulo10;

public class Televisao implements Eletrodomestico{
	int canal;
	int volume;
	
	@Override
	public void ligar() {
		System.out.println("Televisão ligando...");		
	}

	@Override
	public void desligar() {
		System.out.println("Televisão desligando...");		
	}
	
	public void trocarCanal() {
		
	}

}
