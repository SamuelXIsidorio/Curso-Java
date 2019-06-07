package capitulo15;

import capitulo09.Aluno;

public class AppGenerics01 {
	public static void main(String[] args) {
		TesteGenerics<Aluno> tg = new TesteGenerics<>();
		
		tg.lista = new Aluno[5];
		
		TesteGenerics<String> tgS = new TesteGenerics<>();
		
		tgS.lista = new String[5];
		
		
		
		
		
	}
}
