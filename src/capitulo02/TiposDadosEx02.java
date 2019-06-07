package capitulo02;

public class TiposDadosEx02 {
	public static void main(String[] args) {
		// PRIMITIVOS INTEIROS
		byte num1 = 100;
		short num2 = 0100;
		int num3 = 1000;
		long num4 = 100_000_000;
		
		// PRIMITIVOS PONTO FLUTANTE
		float num5 = 85.6F;
		double num6 = 555.7;
		
		// PRIMITIVO CHAR
		char letra01 = '\u0025';
		char letra02 = 37;
		char letra03 = '%';
		
		// PRIMITIVO LÓGICO
		boolean testeV = true;
		boolean testeF = false;
		
		System.out.println("Primitivos Inteiros");
		System.out.println("Byte = " + num1);
		System.out.println("Short = " + num2);
		System.out.println("Int = " + num3);
		System.out.println("Long = " +  num4);
		System.out.println("\nPrimitivos Ponto Flutuante");
		System.out.println("Float = " + num5);
		System.out.println("Double = "  + num6);
		System.out.println("\nPrimitivos Textuais");
		System.out.println("Char01 = " +  letra01);
		System.out.println("Char02 = " +  letra02);
		System.out.println("Char03 = " +  letra03);
		System.out.println("\nPrimitivos Lógicos");
		System.out.println("Boolean = " + testeV);
		System.out.println("Boolean = " + testeF);
		
	}
}
