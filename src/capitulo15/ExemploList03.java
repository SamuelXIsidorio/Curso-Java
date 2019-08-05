package capitulo15;

import java.util.ArrayList;
import java.util.List;

public class ExemploList03 {
	public static void main(String[] args) {
		List<String> pessoas = new ArrayList<>();
		
		pessoas.add("Steve Jobs");
		pessoas.add("Silvester Stallone");
		pessoas.add("Mark Zuckerberg");
		pessoas.add("Mussum");
		
		pessoas.remove(3);
		
		pessoas.forEach(p -> System.out.println(p));
	}
}
