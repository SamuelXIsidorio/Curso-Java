package capitulo15.application;

import capitulo15.model.Carro;
import capitulo15.model.Garagem;
import capitulo15.model.Moto;

public class GaragemApp {
	public static void main(String[] args) {
		Garagem garagemImpacta = new Garagem(25);
		
		garagemImpacta.estacionar(new Carro("Jetta", "Preto", "IKL4132"));
		garagemImpacta.estacionar(new Carro("Golf", "Preto", "RGT4578"));
		garagemImpacta.estacionar(new Carro("Audi", "Preto", "FDG4567"));
		garagemImpacta.estacionar(new Moto("PCX", "Prata", "PQP4712"));
		garagemImpacta.estacionar(new Moto("XJ6", "Branca", "VQV8895"));
		
		garagemImpacta.remover("TRY4578");
		garagemImpacta.imprimirSituacao();

	}
}
