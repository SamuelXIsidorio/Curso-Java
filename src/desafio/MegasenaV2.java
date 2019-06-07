package desafio;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MegasenaV2 {
	public static void main(String[] args) {
		int jogo[] = {0,0,0,0,0,0};
		int sorteado, contador = 1;

		sorteio:
		do {
			sorteado = (int) (1 + Math.random() * 60);
			for(int i=0; i<jogo.length; i++) {
				if(jogo[i] == 0) {
					jogo[i] = sorteado;
					contador++;
					continue sorteio; 
				} else if(jogo[i] == sorteado) {
					continue sorteio; 
				}
			}
		} while(contador <=6); 
		
		System.out.println("Array Original");
		for(int n: jogo) {
			System.out.print(n + " ");
		}
		
		Arrays.sort(jogo); // COLOCAR O ARRAY EM ORDEM CRESCENTE
		String sugestao = "";
		System.out.println("\nArray em ordem crescente");
		for(int n: jogo) {
			sugestao += String.valueOf(n) + " ";
		}
		JOptionPane.showMessageDialog(null, "Sugestão Megasena:\n" + sugestao);
	}
}
