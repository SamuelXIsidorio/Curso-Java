package capitulo03.laboratorio;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		float n1, n2, n3, n4, media;
		String status;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = leitor.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leitor.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = leitor.nextFloat();
		System.out.println("Digite a quarta nota: ");
		n4 = leitor.nextFloat();
		leitor.close();
		
		media = (n1+n2+n3+n4)/4;
		
		if(media < 6) {
			status = "reprovado";
		} else {
			status = "aprovado";
		}
		
		System.out.printf("Nota 1 = %.2f | "
				+ "Nota 2 = %.2f | "
				+ "Nota 3 = %.2f |"
				+ "Nota 4 = %.2f "
				+ "\nO Aluno foi %s com média %.2f"
				,n1, n2, n3, n4, status, media);
	}
}
