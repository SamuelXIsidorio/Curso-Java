package capitulo14;

public class Produto {
	String descricao;
	int numero;
	double valor;
	
	public Produto(String descricao, int numero) {
		this.descricao = descricao;
		this.numero = numero;
	}
	
	public double aumentarPreco(double valor, double aumento) {
		double valorFinal;
		valorFinal = valor + ((valor*aumento)/100);
		return valorFinal; 
	}
}	
