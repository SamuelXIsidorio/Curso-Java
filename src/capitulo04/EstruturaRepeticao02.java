package capitulo04;

public class EstruturaRepeticao02 {
	public static void main(String[] args) {
		int valor01 = 0, valor02 = 0;
		
		while(valor01 < 5) {
			valor01++;
			System.out.println("Primeiro laço While");
			while(valor02 < 5) {
				valor02++;
				System.out.println("\tSegundo laço While");
			}
			valor02 = 0;
		}
		
		for(int i=0; i<4; i++) {
			System.out.println("Primeiro laço For");
			for(int j=0; j<2; j++) {
				System.out.println("\tSegundo laço For");
			}
		}
	}
}
