package capitulo06;

public class UsaCalculadora {
	public static void main(String[] args) {
		int s;
		Calculadora calc = new Calculadora();
		s = calc.somar(15, 20);
		System.out.println("s = " + s);
	}
}
