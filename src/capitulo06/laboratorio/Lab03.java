package capitulo06.laboratorio;

public class Lab03 {
	public static void main(String[] args) {
		Aluno joao, maria, marcos;
		
		joao = new Aluno();
		joao.contadorDeAlunos++;
		joao.setNome("Jo�o");
		joao.imprimeAluno();
		System.out.println("Contagem no objeto jo�o: " + joao.contadorDeAlunos);

		maria = new Aluno();
		maria.contadorDeAlunos++;
		maria.setNome("Maria");
		maria.imprimeAluno();
		System.out.println("Contagem no objeto maria: " + maria.contadorDeAlunos);
		
		marcos = new Aluno();
		marcos.contadorDeAlunos++;
		marcos.setNome("Marcos");
		marcos.imprimeAluno();
		System.out.println("Contagem no objeto marcos: " + marcos.contadorDeAlunos);
		
		System.out.println(Aluno.contadorDeAlunos);
		
	}
}
