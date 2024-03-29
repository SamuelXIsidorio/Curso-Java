package capitulo15.model;

public class Veiculo {
	String modelo;
	String cor;
	String placa;

	public Veiculo(String modelo, String cor, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return modelo + ", " + cor + " - " + placa;
	}
}
