package capitulo06.laboratorio;

import capitulo06.Calculadora;

public class Lab02 {
	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		System.out.println("Métodos sobrecarregados:");
		System.out.println("Chamando a versão  de subtrair com 2 double: " 
						+ calc.subtrair(6.2, 3.1));
		System.out.println("Chamando a versão  de subtrair com 1 double e 1 int: " 
						+ calc.subtrair(8, 3.8));
		System.out.println("Chamando a versão  de subtrair com 1 int e um double: " 
						+ calc.subtrair(5, 2.2));
		
	}
}
