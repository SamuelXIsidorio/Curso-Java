package capitulo15;

import java.util.Vector;

public class ExemploList01 {
	public static void main(String[] args) {
		Vector<String> lista = new Vector<>();
		
		lista.add("Diego");
		lista.add("Thais");
		lista.add("Julia");
		lista.add("Livia");
		
		lista.forEach(nome -> System.out.println(nome));
	}
}
