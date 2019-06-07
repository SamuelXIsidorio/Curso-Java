package capitulo11;

public class ExemploException03 {
	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = 0;
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Erro de divisão por zero!!!!");
		}
	}
}
