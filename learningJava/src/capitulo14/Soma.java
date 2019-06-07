package capitulo14;

public class Soma implements OperacaoAritmetica {

	@Override
	public double execute(double valor1, double valor2) {
		double resultado = valor1 + valor2;
		return resultado;
	}
	
}
