package capitulo14;

public class ProdutoApp {
	public static void main(String[] args) {
		Produto produto = new Produto("Sapato", 42);
		System.out.println("Valor Final: " + produto.aumentarPreco(1000, 10));
		
		OperacaoAritmetica funcao = produto::aumentarPreco;
		System.out.println("Valor final: " +  funcao.execute(1200, 10));
		
	}
}
