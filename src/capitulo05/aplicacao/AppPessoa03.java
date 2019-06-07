package capitulo05.aplicacao;

import capitulo05.modelo.Pessoa;

public class AppPessoa03 {
	public static void main(String[] args) {
		Pessoa fulano = new Pessoa();
		fulano.nome = "Fulano";
		fulano.falar("Java Programmer!");
		
		System.out.println(fulano);
	}
}
