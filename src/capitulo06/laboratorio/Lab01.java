package capitulo06.laboratorio;

import capitulo06.Calculadora;

public class Lab01 {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("calc.somar(6,3) = " + calc.somar(6, 3));
		System.out.println("calc.subtrair(6,3) = " + calc.subtrair(6, 3));
		System.out.println("calc.multiplicar(6,3) = " + calc.multiplicar(6, 3));
		System.out.println("calc.dividir(6,3) = " + calc.dividir(6, 3));
	}
}
