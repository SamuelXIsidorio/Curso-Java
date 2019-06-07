package capitulo04.laboratorio;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um mês para saber quantos dias tem: ");
		String mes = leitor.nextLine().toUpperCase();
		
		switch(mes) {
		case "JANEIRO" :
		case "MARÇO" :
		case "MAIO" :
		case "JULHO" :
		case "AGOSTO" :
		case "OUTUBRO" :
		case "DEZEMBRO" :
			System.out.println("O mês de " + mes +" tem 31 dias");
			break;
		case "FEVEREIRO" :
			System.out.println("Digite o ano escolhido: ");
			int ano = leitor.nextInt();
			if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
				System.out.println("O mês de " + mes + " tem 29 dias");
				System.out.println(ano + " é Bissexto!");
			} else {
				System.out.println("O mês de " + mes + " tem 28 dias");
				System.out.println(ano + " não é Bissexto!");
			}
			break;
		case "ABRIL" :
		case "JUNHO" :
		case "SETEMBRO" :
		case "NOVEMBRO" :
			System.out.println("O mês de " + mes + " tem 30 dias");
			break;
		default:
			System.out.println("Mês digitado é inválido");
			break;
		}
		
		leitor.close();
	}
}
