package capitulo15;

import java.util.ArrayList;

public class ExemploArrayList01 {
	public static void main(String[] args) {
		// CRIANDO UMA LISTA DE ELEMENTOS STRINGS EM UM ARRAYLIST
		ArrayList<String> listaAlunos = new ArrayList<>();
		
		//INSERIR ELEMENTOS NA LISTA
		listaAlunos.add("Philip");
		listaAlunos.add("Samuel");
		listaAlunos.add("Leonardo");
		listaAlunos.add("Marcos");
		listaAlunos.add("Deivison");
		listaAlunos.add("Giovanna");
		listaAlunos.add("Lucas");
		
		// VERIFICAR O TAMANHO DE UMA LISTA
		System.out.println("Quantidade de alunos: " + listaAlunos.size());
		// RECUPERA O PRIMEIRO ELEMENTO DA LISTA
		System.out.println("Primeiro elemento da lista: " + listaAlunos.get(0));
		// RECUPERA O ULTIMO ELEMENTO DA LISTA
		System.out.println("Ultimo elemento da lista: " + listaAlunos.get(listaAlunos.size()-1));
		// EXIBIR O QUE TEM NA LISTA NO MOMENTO
		System.out.println(listaAlunos);
		
		// PERCORRER A LISTA (CONVENCIONAL)
		System.out.println("\nPercorrendo com FOR");
		for(int i = 0; i < listaAlunos.size();  i++) {
			System.out.println(listaAlunos.get(i));
		}
		
		System.out.println("\nPercorrendo com FOREACH");
		for(String aluno: listaAlunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\nPercorrendo com método FOREACH");
		listaAlunos.forEach(aluno -> System.out.println("Nome do aluno = " + aluno));
	}
}
