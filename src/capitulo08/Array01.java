package capitulo08;

public class Array01 {
	public static void main(String[] args) {
		String nomes[] = new String[8];
		int valores[] = new int[3];
		
		nomes[0] = "Deivison";
		nomes[1] = "Giovanna";
		nomes[2] = "Marcos";
		nomes[3] = "Leonardo";
		nomes[4] = "Samuel";
		nomes[5] = "Philip";
		nomes[6] = "Gabriel";
		nomes[7] = "Diego";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println(nomes[3]);
		System.out.println(nomes[4]);
		System.out.println(nomes[5]);
		System.out.println(nomes[6]);
		System.out.println(nomes[7]);
		
		System.out.println(nomes.length);// QUANTIDADE DE ELEMENTOS DO ARRAY
		System.out.println(nomes[nomes.length - 1]); //ULTIMA POSIÇÃO DO ARRAY
		
		System.out.println("\nIMPRIMINDO O ARRAY COM FOR");
		for(int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("\nIMPRIMINDO COM FOREACH");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		valores[0] = 12;
		valores[1] = 5;
		valores[2] = 7;
				
	}
}
