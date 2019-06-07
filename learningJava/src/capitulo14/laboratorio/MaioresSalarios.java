package capitulo14.laboratorio;

public class MaioresSalarios {
	public static void main(String[] args) {
		double salarioBrutos[] = {1350, 4320.15, 8235.25, 2500.55, 1830, 850.26, 3614.29, 12500};
		double salariosTop[];
		
		salariosTop =  DoubleArrayUtils.filtraValores(salarioBrutos, d -> d >= 3000);
		DoubleArrayUtils.processaValores(salariosTop, 
											d -> System.out.printf("SalarioTOP: %,5.2f\n", d ));	
	}
}
