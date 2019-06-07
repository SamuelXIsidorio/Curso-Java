package capitulo15;

public class Veiculo {
	String modelo;
	String cor;
	String placa;
	
	public Veiculo(String modelo, String cor, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return modelo + ", " + cor + " - " + placa;
	}
}
