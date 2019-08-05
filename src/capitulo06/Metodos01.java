package capitulo06;

import capitulo05.modelo.Pessoa;

public class Metodos01 {
	
	public void exemploMetodo01() {
		System.out.println("Estou passando pelo metodo 1");
	}
	
	public String exemploRetorno() {
		return "Passei pelo metodo ExemploRetorno";
	}
	
	public Pessoa exemploRetornoClasse() {
		return new Pessoa();
	}
	
	public int somarArray(int x[]) {
		int soma = 0;
		for(int i=0; i<x.length; i++) {
			soma += x[i]; 
		}
		return soma;
	}
	
	public double[] aumentarSalario(double x[]) {
		double salariosNovos[] = new double[x.length];
		for(int i=0; i<x.length; i++) {
			salariosNovos[i] = x[i] * 1.10;
		}
		return salariosNovos;
	}
}
