package capitulo03.laboratorio;

import java.util.Scanner;

public class Lab01_v3 {
	public static void main(String[] args) {
		int valor1, valor2, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		sc.close();
		resultado = valor1+ valor2;

		System.out.printf("%d + %d = %d", valor1, valor2, resultado);
		
		
	}
}
