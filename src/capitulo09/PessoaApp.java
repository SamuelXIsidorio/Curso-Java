package capitulo09;

public class PessoaApp {
	public static void main(String[] args) {
		
		Pessoa p1 = new Aluno("Jeferson", "Oliveira", 25, 'M', "Java", 5624, 125.8);
		p1.mostrarDados();

		Pessoa p2 = new Professor("Diego", "Sousa", 30, 'M', "Java", 5477896, 20000);
		p2.mostrarDados();
		
	}
}
