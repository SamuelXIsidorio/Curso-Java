package capitulo15;

import java.util.ArrayList;

public class ExemploList02 {
	public static void main(String[] args) {
		ArrayList<Double> salarios = new ArrayList<>();
		ArrayList<Double> salariosAtualizados = new ArrayList<>();
		
		salarios.add(1000.00);
		salarios.add(2000.00);
		salarios.add(3000.00);
		salarios.add(4000.00);
		
		System.out.println("Salarios da lista \"salarios\"");
		salarios.forEach(salario -> System.out.printf("Salario: R$%,5.2f\n",salario));
		
		System.out.println("\nSalarios da lista \"salarios\" exibindo com 10%");
		// EXIBIR O VALOR DE CADA SALARIO ACRESCENTANDO 10%
		salarios.forEach(salario -> System.out.printf("%,5.2f\n",salario*1.1));
		
		// ALTERAR A LISTA AUMENTANDO O VALOR EM 10%
		salariosAtualizados.addAll(salarios);
		salariosAtualizados.replaceAll(sa -> sa*1.15);
		System.out.println("\nSalarios da lista \"salariosAtualizados\"");
		salariosAtualizados.forEach(sa -> System.out.printf("Salario: %,5.2f\n", sa));
		
		System.out.println("\nSalarios da lista \"salarios\"");
		salarios.forEach(System.out::println);
	}
}
