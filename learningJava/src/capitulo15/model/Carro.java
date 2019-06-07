package capitulo15.model;

public class Carro extends Veiculo {

	public Carro(String modelo, String cor, String placa) {
		super(modelo, cor, placa);
	}
	
	@Override
	public String toString() {
		return "Carro: " + super.toString();
	}
	
}
