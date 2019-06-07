package capitulo03.laboratorio;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		int valor;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um valor para verificar se é par ou impar");
		valor = leitor.nextInt();
		leitor.close();
		
		System.out.println(valor%2 == 0 ? "Numero Par" : "Numero Impar");
		
	}
}
