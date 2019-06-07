package capitulo02;

import javax.swing.JOptionPane;


public class VariaveisEx01 {
	
	public static void main(String[] args) {
		// INFORMAR O TIPO, IDENTIFICADOR E VALOR
		int idade = 35;
		int a, b, c, d = 8;
		a = 10;
		b = 6;
		c = 9;
		String curso = "Java Programmer";
		curso = "HTML";
		System.out.println(curso);
		
			final int VALOR = 5;
		System.out.println(VALOR);
	
		
		System.out.println(idade);
		System.out.println(a + "," + b + "," + c + "," + d);
		
		idade = 65;
		System.out.println(idade);
		
		JOptionPane.showMessageDialog(null, "");
		
	}
}
