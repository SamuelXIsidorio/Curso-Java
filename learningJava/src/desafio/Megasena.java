package desafio;

public class Megasena {
	public static void main(String[] args) {
		int jogo[] = {0,0,0,0,0,0};
		int sorteado, ordena, contador = 1;

		//  NÃO REPETIR OS NUMEROS
		sorteio:
		do {
			// GERAR NUMEROS ALEATRORIOS ENTRE 1 E 60 INCLUSIVE
			sorteado = (int) (1 + Math.random() * 60);
			
			// GERAR 6 NUMEROS
			for(int i=0; i<jogo.length; i++) {
				// VERIFICA SE O VALOR DO ARRAY JOGO NA POSIÇÃO DA VARIÁVEL I É IGUAL A ZERO,
				// CASO ISSO SEJA VERDADE SIGNIFICA QUE ESTA POSIÇÃO AINDA NÃO RECEBEU UM NUMERO
				// DE SORTEIO, ENTÃO O NUMERO QUE FOI SORTEADO ANTERIORMENTE É INSERIDO NESTA
				// POSIÇÃO DE I DO ARRAY JOGO
				if(jogo[i] == 0) {
					jogo[i] = sorteado;
					contador++; // ADICONA 1 NA VARIÁVEL, ESTA SERÁ TESTADA PARA SABER SE JA 
					// TEM O VALOR 6, CASO SEJA VERDADE SABEMOS QUE JA FOI SORTEADO E INSERIDO
					// NO ARRAY 6 NUMEROS QUE NÃO SE REPETEM.
					continue sorteio; // VOLTA A EXECUÇÃO PARA A LINHA DE DO/WHILE
					//VERIFICA SE O VALOR DO ARRAY JOGO NA POSICAO DA VARIAVEL I É IGUAL AO 
					//NUMERO SORTEADO CASO SEJA VERDADE ELE VOLTA AO INICIO DO DO WHILE,
					//SORTEANDO UM NOVO NUMERO E INICIANDO A COMPARAÇÃO DO FOR NOVAMENTE;
				} else if(jogo[i] == sorteado) {
					continue sorteio; // VOLTA A EXECUÇÃO PARA A LINHA DE DO/WHILE
				}
			}
			
		} while(contador <=6); // CASO CONTADOR SEJA DIFERENTE DE <= SIGNIFICA QUE NOSSO ARRAY
		// ESTA PREENCHIDO E OS NUMEROS NÃO SÃO REPETIDOS. ENTÃO O LAÇO PARA.
		
		System.out.println("Array Original");
		for(int n: jogo) {
			System.out.print(n + " ");
		}
		
		
		// APRESENTAR O RESULTADO EM ORDEM CRESCENTE
		// O PRIMEIRO FOR GARANTE A NAVEGAÇÃO SOBRE O ARRAY JOGO POR COMPLETO
		for(int i=0; i<jogo.length; i++) { 
			// O SEGUNDO FOR SEMPRE VERIFICA A PROXIMA POSIÇÃO DO ARRAY, BASEADA NA POSICAO
			// DO PRIMEIRO FOR. SENDO ASSIM O INICIO DA VARIAVEL DE CONTROLE J FICA COMO I + 1
			for(int j=i+1; j<jogo.length; j++) {
				if(jogo[i] > jogo[j]) {
					ordena = jogo[i]; // ARMAZENANDO O VALOR DE JOGO[I]
					jogo[i] = jogo[j]; // COLOCANDO O VALOR DO PROXIMO INDICE NO ATUAL
					jogo[j] = ordena; // RECUPERANDO O VALOR DE INDICE ANTERIOR
				}
			}
		}
		
		System.out.println("\nArray em ordem crescente");
		for(int n: jogo) {
			System.out.print(n + " ");
		}
	}
}
