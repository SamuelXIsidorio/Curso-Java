package capitulo04;

public class EstruturaRepeticao01 {
	public static void main(String[] args) {
		int num = 0;
		while(num<5) {
			System.out.println("Valor de num é " + num);
			num++;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i é " + i);
		}
		
		int valor = 10;
		do {
			System.out.println("Valor da variavel é " + valor);
		}while(valor < 10);
		
		
	}
}
