package capitulo08;

import capitulo05.modelo.Pessoa;

public class Array05 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jorge", 32, 'M');
		Pessoa alunos[] = {new Pessoa("Diego",30, 'M'),new Pessoa("Luana", 26, 'F'), p1};
		
		for (Pessoa pessoa : alunos) {
			System.out.println(pessoa);
		}
	}
}
