package capitulo10;

public class Televisao implements Eletrodomestico{
	int canal;
	int volume;
	
	@Override
	public void ligar() {
		System.out.println("Televis�o ligando...");		
	}

	@Override
	public void desligar() {
		System.out.println("Televis�o desligando...");		
	}
	
	public void trocarCanal() {
		
	}

}
