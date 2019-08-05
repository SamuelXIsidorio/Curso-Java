package capitulo04;

public class EstruturaCondicional01 {
	public static void main(String[] args) {
		int valor = 10;
		String nome = "Diego Sousa";
		
		if(valor != 10) {
			System.out.println("Valor é igual a 10");
		}
		
		System.out.println("Fora da condição");
			
		
		if(nome.length() < 5) {
			System.out.println("Nome curto");
		} else {
			System.out.println("Nome longo");
		}
		
		if (valor == 3) {
			System.out.println("Valor baixo");
		} else if(valor > 5) {
			System.out.println("Valor alto");
		} else if(valor != 7) {
			System.out.println("Valor não é 7");
		} else {
			System.out.println("Não sei mais o que perguntar");
		}
	}
}
