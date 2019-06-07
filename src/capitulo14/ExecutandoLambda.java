package capitulo14;

public class ExecutandoLambda {
	public static void main(String[] args) {
		
		OperacaoAritmetica ex = (valor1, valor2) -> valor1 + 2*valor2;
		System.out.println(ex.execute(1, 2));
		
		OperacaoAritmetica op = (x, y) -> x + y;
		System.out.println(op.execute(10, 13.2));
		
	
		
	}
}
