package capitulo02;

public class TiposDadosEX01 {
	public static void main(String[] args) {
		String nome = new String(); // INSTANCIA (CRIAÇÃO DE UM OBJETO)
		String sobrenome = "Sousa";
		String produto = new String("Chocolate");
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(produto);
		
		// ESTE É UM TIPO PRIMITIVO, SENDO ASSIM NÃO TEM ACESSO A MÉTODOS
		byte numero01 = 100; 
		System.out.println(numero01);
		
		// VARIAVEIS DO TIPO STRING ACESSAM MÉTODOS POIS SÃO OBJETOS DA CLASSE STRING
		System.out.println(nome.length());
		System.out.println(sobrenome.length());
		System.out.println(produto.length());
		
		// STRING É IMUTAVEL, AQUI ESTAMOS SOBRESCREVENDO O VALOR
		sobrenome = sobrenome + " Marcos"; 
		System.out.println(sobrenome);
		
		
	}
}
