package capitulo10.laboratorio;

public class Lab01 {
	public static void main(String[] args) {
		Imprimivel relatorio = new Relatorio();
		Imprimivel grafico = new Grafico();
		
		grafico.imprimir();
		relatorio.imprimir();
	}
}
