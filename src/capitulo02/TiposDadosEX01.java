package capitulo02;

public class TiposDadosEX01 {
	public static void main(String[] args) {
		String nome = new String(); // INSTANCIA (CRIA��O DE UM OBJETO)
		String sobrenome = "Sousa";
		String produto = new String("Chocolate");
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(produto);
		
		// ESTE � UM TIPO PRIMITIVO, SENDO ASSIM N�O TEM ACESSO A M�TODOS
		byte numero01 = 100; 
		System.out.println(numero01);
		
		// VARIAVEIS DO TIPO STRING ACESSAM M�TODOS POIS S�O OBJETOS DA CLASSE STRING
		System.out.println(nome.length());
		System.out.println(sobrenome.length());
		System.out.println(produto.length());
		
		// STRING � IMUTAVEL, AQUI ESTAMOS SOBRESCREVENDO O VALOR
		sobrenome = sobrenome + " Marcos"; 
		System.out.println(sobrenome);
		
		
	}
}
