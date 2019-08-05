package capitulo14;

public class Executando {
	public static void main(String[] args) {
		OperacaoAritmetica soma = new Soma();
		System.out.println(soma.execute(15, 7.8));
		
		OperacaoAritmetica subtracao = new Subtracao();
		System.out.println(subtracao.execute(8, 4.2));
		
	}
}
