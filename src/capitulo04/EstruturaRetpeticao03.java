package capitulo04;

public class EstruturaRetpeticao03 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i != 5) {
			System.out.println("Numero " + i);
			} else {
				System.out.println("Passamos pelo numero 5");
				break; // encerra o laço
			}
		}
		
		principal:
		for (int i = 1; i <= 10; i++) {
			System.out.println("Imprimindo o primeiro laço" + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println("\tImprimindo o segundo laço" + j);
				if(j == 5) {
					break principal;
				}
			}
		}
	}
}
