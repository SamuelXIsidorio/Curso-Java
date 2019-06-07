package capitulo14.laboratorio;

public class DescontoSalarial {

	public static void main(String[] args) {
		double salarioBrutos[] = {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};
		double salariosLiquidos[];
		
		salariosLiquidos = DoubleArrayUtils.transformaValores(salarioBrutos, d -> .9 * d);
		DoubleArrayUtils.processaValores(salariosLiquidos, 
											d -> System.out.printf("Valor: %.2f\n",d));	
	}

}
