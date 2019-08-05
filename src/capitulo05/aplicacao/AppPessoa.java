package capitulo05.aplicacao;

import capitulo05.modelo.Pessoa;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa francisco = new Pessoa(); // INSTANCIAR OBJETO
		Pessoa joaquim = new Pessoa("Joaquim", 29,'M'); // INSTANCIAR OBJETO
		Pessoa juliana = new Pessoa("Juliana", 23, 'F');
		
		System.out.println("toString: " + francisco);
		System.out.println("superClass: " + francisco.getClass().getSuperclass());
		System.out.println("Nome: " + francisco.nome);
		System.out.println("Idade: " + francisco.idade);
		System.out.println("Sexo: " +francisco.sexo);
		System.out.println();
		System.out.println("toString: " + joaquim);
		System.out.println("superClass: " + joaquim.getClass().getSuperclass());
		System.out.println("Nome: " + joaquim.nome);
		System.out.println("Idade: " + joaquim.idade);
		System.out.println("Sexo: " + joaquim.sexo);
		System.out.println();
		System.out.println("toString: " + juliana);
		System.out.println("superClass: " + juliana.getClass().getSuperclass());
		System.out.println("Nome: " + juliana.nome);
		System.out.println("Idade: " + juliana.idade);
		System.out.println("Sexo: " + juliana.sexo);
		
		
	}
}
