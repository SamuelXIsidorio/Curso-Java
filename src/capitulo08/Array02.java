package capitulo08;

public class Array02 {
	public static void main(String[] args) {
		String listaNomes[] = new String[3]; // UNIDIMENSIONAL
		int notasAlunos[][] = new int[2][3]; // BIDIMENSIONAL
		int notas[][][] = new int[2][2][3]; // MULTIDIMENSIONAL

		listaNomes[0] = "Diego";
		listaNomes[1] = "Vinicius";
		listaNomes[2] = "Gabriel";
		
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		notasAlunos[0][0] = 9; // PRIMEIRO ALUNO, PRIMEIRA NOTA
		notasAlunos[0][1] = 7; // PRIMEIRO ALUNO, SEGUNDA NOTA
		notasAlunos[0][2] = 8; // PRIMEIRO ALUNO, TERCEIRA NOTA
		
		notasAlunos[1][0] = 6; // SEGUNDO ALUNO, PRIMEIRA NOTA
		notasAlunos[1][1] = 8; // SEGUNDO ALUNO, SEGUNDA NOTA
		notasAlunos[1][2] = 7; // SEGUNDO ALUNO, TERCEIRA NOTA
		
		notas[0][0][0] = 0; // PRIMEIRO ALUNO, PRIMEIRA MATERIA, PRIMEIRA NOTA
		notas[0][0][1] = 4; // PRIMEIRO ALUNO, PRIMEIRA MATERIA, SEGUNDA NOTA
		notas[0][0][2] = 6; // PRIMEIRO ALUNO, PRIMEIRA MATERIA, TERCEIRA NOTA
		
		notas[0][1][0] = 5; // PRIMEIRO ALUNO, SEGUNDA MATERIA, PRIMEIRA NOTA
		notas[0][1][1] = 3; // PRIMEIRO ALUNO, SEGUNDA MATERIA, SEGUNDA NOTA
		notas[0][1][2] = 2; // PRIMEIRO ALUNOS, SEGUNDA MATERIA, TERCEIRA NOTA
		
		
	}
}
