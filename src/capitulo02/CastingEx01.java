package capitulo02;

public class CastingEx01 {
	public static void main(String[] args) {
		byte b = 10;
		int i;
		
		i = b; // AUTO CASTING
		b = (byte) i; // CASTING
		
		double numeroMaior = 1256.89;
		int x = (int) numeroMaior;
		System.out.println(x);
		
		float salario = 2555.98F;
		double salarioNovo = salario;
		System.out.println(salarioNovo);
		
		double ano = 2018;
		int anoAtual = (int) ano;
		System.out.println(anoAtual);
		
		
		
		
		
	}
}
