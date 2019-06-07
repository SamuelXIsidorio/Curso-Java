package capitulo03;

import javax.swing.JOptionPane;

public class OperadoresEx06 {
	public static void main(String[] args) {
		int num = 7;
		
		if(num == 7) {
			System.out.println("Valor é 7");
		} else {
			System.out.println("Valor é diferente de 7");
		}
		
		// OPERADOR TERNARIO
		System.out.println(num == 7 ? "Valor é 7" : "Valor é diferente de 7");
		
		String test = num == 7 ? "Valor é 7" : "Valor é diferente de 7";
		System.out.println(test);
		
		JOptionPane.showMessageDialog(null, num == 7 ? "Valor é 7" : "Valor é diferente de 7");
	}
}
