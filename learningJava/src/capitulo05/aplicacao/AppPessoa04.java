package capitulo05.aplicacao;

import capitulo05.modelo.Pessoa;

public class AppPessoa04 {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.nome = "João";
		joao.idade = 18;
		joao.sexo = 'M';
		
		maria.nome = "Maria";
		maria.idade = 25;
		maria.sexo = 'F';
		
		joao = maria;
		joao.idade = 48;
		maria.idade = 32;
		System.out.println("Exibindo informacões de João:");
		System.out.println("Nome: " + joao.nome);
		System.out.println("Idade: " + joao.idade);
		System.out.println("Sexo: " + joao.sexo);
		
		System.out.println("\n\nExibindo informações de Maria:");
		System.out.println("Nome: " + maria.nome);
		System.out.println("Idade: " + maria.idade);
		System.out.println("Sexo: " + maria.sexo);
		
		
		
	}
}
