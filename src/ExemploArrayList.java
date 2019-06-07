import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Diego Sousa");
		listaNomes.add("Philip");
		listaNomes.add("Giovanna");
		listaNomes.add("Marcos");
		listaNomes.add("Samuel");
		listaNomes.add("Deivison");
		listaNomes.add("Lucas");
		
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		System.out.println(listaNomes.size());
		
		listaNomes.remove(0);
		
		System.out.println(listaNomes.size());
		
		listaNomes.forEach(s -> System.out.println(s));
		
	}
}
