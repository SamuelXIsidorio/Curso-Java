package capitulo03;

public class OperadoresEx03 {
	public static void main(String[] args) {
		// OPERADORES LÓGICOS
		int a = 10, b = 5, c = 2;
		
		System.out.println(!(a <= c || b != a)); // NOT
		System.out.println(a <= c && b != a); // AND
		System.out.println(a <= c || b != a); // OR
		System.out.println(a < c ^ b != a); // XOR
		
	}
}
