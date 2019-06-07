package capitulo15;

import java.util.Arrays;

public class ListaNomes {
	public static void main(String[] args) {
		String listaNomes[] = {"DEIVISON", "GIOVANNA", "LUCAS", "MARCOS", "SAMUEL",
								"PHILIP", "GABRIEL","LEONARDO","DIEGO"};
		int indice;
		
		System.out.println("Tamanho do Array: " + listaNomes.length);
		
		indice = 0; // Primeiro indice do Array
		System.out.println("Primeiro elemento do Array: " + listaNomes[indice]);
		
		indice = listaNomes.length-1;
		System.out.println("Ultimo elemento do Array: " +  listaNomes[indice]);
		
		System.out.println("----------------------------\n");
		
		for(int i = 0; i<= listaNomes.length; i++) {
			System.out.println("Nome: " +  listaNomes[i]);
		}
		
		Arrays.sort(listaNomes);
		
		System.out.println("\n");
		for (String n: listaNomes) {
			System.out.println("Nome ForEach -> " +  n);
		}
		
	}
}
