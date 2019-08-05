package capitulo08;

public class Array06 {
	public static void main(String[] args) {
		
		/*    0 1 2
		 *    _ _ 
		 * 0 |_|_|_
		 * 1 |_|_|_| 
		 * 2 |_|_| 
		 *  
		 */
		
		int valores[][] = {{5,6},{9,8,7},{4,2}};
		int numeros[][] = {{7,3},{8,4}};
		
		for(int linha=0; linha < numeros.length; linha++) {
			for(int coluna=0; coluna < numeros[linha].length; coluna++) {
				System.out.print(numeros[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		for(int linha=0; linha < valores.length; linha++) {
			for(int coluna=0; coluna < valores[linha].length; coluna++) {
				System.out.print(valores[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}
}
