package capitulo15.garagem;

public class GaragemApp {
	public static void main(String[] args) {
		Garagem garagemDoMarcos = new Garagem(5);
	
		garagemDoMarcos.estacionarCarro(new Carro("Sportage", "Branca", "FTR5589"));
		garagemDoMarcos.estacionarCarro(new Moto("Fireblade", "Azul", "DFR8413"));
		garagemDoMarcos.estacionarCarro(new Carro("Palio", "Preto", "ASD8813"));
		garagemDoMarcos.estacionarCarro(new Moto("Burgman", "Vermelho", "DFC2243"));
		garagemDoMarcos.estacionarCarro(new Carro("UP", "Cinza", "HTY4578"));
		
		System.out.println("Lista da Garagem:");
		garagemDoMarcos.imprimeStatus();
		
		garagemDoMarcos.retirarCarro(0);
		System.out.println("\nLista da Garagem Atualizada:");
		garagemDoMarcos.imprimeStatus();
	}
}
