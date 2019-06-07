package capitulo15.model;

public class Moto extends Veiculo{

	public Moto(String modelo, String cor, String placa) {
		super(modelo, cor, placa);
	}
	
	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
}
