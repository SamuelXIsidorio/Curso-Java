package capitulo04.laboratorio;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero, divisoes = 0;
		
		System.out.println("Digite um n�mero: ");
		numero = leitor.nextInt();
		leitor.close();
		
		for(int i = 1; i<=numero; i++) {
			if(numero % i == 0) { // SE O NUMERO FOR DIVISIVEL POR I E O RESTO FOR 0 
				// ADICIONAMOS DENTRO DA VARIAVEL DIVIS�ES PARA SABER QUANTAS
				// VEZES FOI POSSIVEL DIVIDIR O NUMERO DE 1 AT� O VALOR DELE MESMO.
				divisoes++;
			}
		}
		
		// SE A QUANTIDADE DE DIVISOES FOR MENOR OU IGUAL A 2 O NUMERO � PRIMO
		System.out.println(divisoes <=2 
				? "Numero � primo, pois tem apenas " + divisoes + " divis�es!" 
				: "Numero n�o � primo, pois tem " + divisoes + " divis�es!");
	}
}
