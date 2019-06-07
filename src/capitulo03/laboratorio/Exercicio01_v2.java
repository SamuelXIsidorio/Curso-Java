package capitulo03.laboratorio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01_v2 {
	public static void main(String[] args) {
		float n1, n2, n3, n4, media;
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
		
		JOptionPane.showMessageDialog(null, media < 6 
				?
					"Nota 1 = " + n1 + " | "
					+ "Nota 2 = " + n2 + " | "
					+ "Nota 3 = " + n3 + " | "
					+ "Nota 4 = "+ n4 
					+ "\nO Aluno foi reprovado com média " + media
				:
					"Nota 1 = " + n1 + " | "
					+ "Nota 2 = " + n2 + " | "
					+ "Nota 3 = " + n3 + " | "
					+ "Nota 4 = "+ n4 
					+ "\nO Aluno foi aprovado com média " + media);
	}
}
