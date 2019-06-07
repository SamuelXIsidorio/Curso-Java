package capitulo05.laboratorio;

public class Garagem {
	Carro carroPasseio;
	Carro carroUtilitario;
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio = new Carro();
		g.carroPasseio.modelo = "Jetta";
		g.carroPasseio.potenciaMotor = 2.0;
		g.carroPasseio.cor = "Preto";
		
		g.carroUtilitario = new Carro();
		g.carroUtilitario.modelo = "Sportage";
		g.carroUtilitario.potenciaMotor = 3.5;
		g.carroUtilitario.cor = "Branco";
		
		System.out.println("Carro de passeio:");
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Potência Motor: " + g.carroPasseio.potenciaMotor);
		System.out.println("-------------------------------------");
		System.out.println("Carro utilitario: ");
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Potência Motor: " + g.carroUtilitario.potenciaMotor);
		
	}
}
