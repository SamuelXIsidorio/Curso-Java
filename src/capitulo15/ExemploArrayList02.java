package capitulo15;

import java.util.ArrayList;

public class ExemploArrayList02 {
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
		
		// INFORMAR A POSIÇÃO EM QUE SE ENCONTRA UM ELEMENTO
		System.out.println("Elemento Giovanna, Posição = " + listaAlunos.indexOf("Giovanna"));
		
		// REMOVER UM ELEMENTO DA LISTA ATRAVÉS DO INDICE
		listaAlunos.remove(0);
		
		//REMOVER UM ELEMENTO DA LISTA ATRAVÉS DO OBJETO
		listaAlunos.remove("Marcos");
		
		//EXIBIR A LISTA PELO MÉTODO FOREACH E METHOD REFERENC (SYSTEM.OUT.PRINTLN)
		System.out.println();
		listaAlunos.forEach(System.out::println);
		
		// VERIFICA SE UM ELEMENTO CONSTA NA LISTA
		System.out.println();
		System.out.println("Diego esta na lista: " + listaAlunos.contains("Diego"));
		System.out.println("Lucas esta na lista: " + listaAlunos.contains("Lucas"));
		
		// EXECUTA UMA SUBSTITUIÇÃO DOS ELEMENTOS DE ACORDO COM A MANIPULAÇÃO DESEJADA
		listaAlunos.replaceAll(aluno -> aluno.toUpperCase());
		
		//EXIBIR A LISTA PELO MÉTODO FOREACH E METHOD REFERENC (SYSTEM.OUT.PRINTLN)
		System.out.println();
		listaAlunos.forEach(System.out::println);
		
		// MODIFICA A LISTA PARA SER ORDENADA DE ACORDO COM O TAMANHO DOS NOMES
		listaAlunos.sort((a1, a2) -> {
			if (a1.length() > a2.length()) {
				return +1;
			} else if(a1.length() < a2.length()) {
				return -1;
			} else {
				return 0;
			}
		});
		System.out.println("\n\n");
		listaAlunos.forEach(System.out::println);
		
		//MODIFICA A LISA PARA SER ORDENADA DE ACORDO COM A ORDEM ALFABETICA
		listaAlunos.sort((a1, a2) -> a1.compareTo(a2));
		System.out.println("\n\n");
		listaAlunos.forEach(System.out::println);
		
	}
}
