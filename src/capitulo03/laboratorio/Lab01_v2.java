package capitulo03.laboratorio;

import javax.swing.JOptionPane;

public class Lab01_v2 {
	public static void main(String[] args) {
		int valor1, valor2, resultado;
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		resultado = valor1+ valor2;
		JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " = " + resultado);
	
		System.out.println("Linha 1");
		System.out.println("Linha 2");
		System.out.println("Linha 3");
		System.out.println("Linha 4");
		
	}
}
